package com.ownly.order.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ownly.order.client.InventoryClient;
import com.ownly.order.entity.OrderEntity;
import com.ownly.order.entity.PaymentEntity;
import com.ownly.order.exception.OrderNotFoundException;
import com.ownly.order.repository.OrderRepository;
import com.ownly.order.repository.PaymentRepository;
import com.ownly.order.request.OrderRequest;
import com.ownly.order.response.InventoryResponse;
import com.ownly.order.response.OrderResponse;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;
    private final InventoryClient inventoryClient;

    public OrderService(
            OrderRepository orderRepository,
            PaymentRepository paymentRepository,
            InventoryClient inventoryClient) {

        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
        this.inventoryClient = inventoryClient;
    }

    // Place order after checking inventory
    @Transactional
    public OrderResponse placeOrder(OrderRequest request) {

        // Step 1: Check inventory through Feign
    	boolean available = inventoryClient.checkStock(
    	        request.getProduct_id(),
    	        request.getQuantity());

    	if (!available) {
    	    throw new IllegalStateException(
    	            "Insufficient stock for product ID: "
    	                    + request.getProduct_id());
    	}

        // Step 2: Create order
        OrderEntity order = new OrderEntity();
        order.setCustomer_id(request.getCustomer_id());
        order.setProduct_id(request.getProduct_id());
        order.setQuantity(request.getQuantity());
        order.setPayment_method(request.getPayment_method());
        order.setDelivery_address(request.getDelivery_address());

        int orderId = (int) (Math.random() * 9000) + 100000;
        order.setOrder_id(orderId);

        OrderEntity savedOrder = orderRepository.save(order);

        // Step 3: Create payment
        PaymentEntity payment = new PaymentEntity();
        payment.setOrder_id(savedOrder.getOrder_id());
        payment.setPayment_method(request.getPayment_method());
        payment.setPayment_status("PAID");
        payment.setAmount(50000);

        paymentRepository.save(payment);

        // Step 4: Build response
        OrderResponse response = new OrderResponse();
        response.setCustomerId(savedOrder.getCustomer_id());
        response.setOrderId(savedOrder.getOrder_id());
        response.setOrderStatus("Placed");
        response.setPaymentStatus("PAID");
        response.setTotalAmount(50000);

        return response;
    }

    // Fetch all inventory through Feign
    public List<InventoryResponse> getInventory() {

        System.out.println("ORDER: Sending request to Inventory Service");

        List<InventoryResponse> response =
                inventoryClient.getAllInventory();

        System.out.println("ORDER: Inventory Service responded successfully");
        System.out.println("ORDER: Received records = " + response.size());

        return response;
    }

    // Fetch order by ID
    public OrderEntity getOrderById(int orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found: " + orderId));
    }
}