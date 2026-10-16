package com.flipkart.order.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flipkart.order.client.InventoryClient;
import com.flipkart.order.entity.OrderEntity;
import com.flipkart.order.repository.OrderRepository;
import com.flipkart.order.request.CreateOrderRequest;
import com.flipkart.order.response.OrderResponse;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    public OrderService(OrderRepository orderRepository, InventoryClient inventoryClient) {
        this.orderRepository = orderRepository;
        this.inventoryClient = inventoryClient;
    }

    @Transactional
    @CacheEvict(value = "orders", allEntries = true)
    public OrderResponse createOrder(CreateOrderRequest request) {
        InventoryClient.InventoryResponse inventory =
                inventoryClient.getInventory(request.productId());

        if (inventory == null || inventory.availableQuantity() == null) {
            throw new IllegalStateException("Inventory Service returned an invalid response");
        }

        if (inventory.availableQuantity() < request.quantity()) {
            throw new InsufficientStockException(
                    "Insufficient stock for product " + request.productId()
            );
        }

        BigDecimal total = request.unitPrice()
                .multiply(BigDecimal.valueOf(request.quantity()));

        OrderEntity order = new OrderEntity(
                request.customerId(),
                request.productId(),
                request.quantity(),
                request.unitPrice(),
                total
        );

        return OrderResponse.from(orderRepository.save(order));
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "orders", key = "#orderId")
    public OrderResponse getOrderById(Long orderId) {
        OrderEntity order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException(orderId));
        return OrderResponse.from(order);
    }

    @Transactional(readOnly = true)
    public List<OrderResponse> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(OrderResponse::from)
                .toList();
    }
}
