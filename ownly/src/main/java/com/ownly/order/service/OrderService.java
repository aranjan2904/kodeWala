package com.ownly.order.service;

import org.springframework.stereotype.Service;

import com.ownly.order.entity.OrderEntity;
import com.ownly.order.repository.OrderRepository;
import com.ownly.order.request.OrderRequest;
import com.ownly.order.response.OrderResponse;

@Service
public class OrderService {

    // Repository is used to communicate with the database
    private final OrderRepository orderRepository;

    // Constructor-based Dependency Injection
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Business logic for placing an order
    public OrderResponse placeOrder(OrderRequest request) {

        // Create a new Entity object that will be stored in the database
        OrderEntity orderEntity = new OrderEntity();

        // Copy the data received from the client (Request DTO)
        // into the Entity object
        orderEntity.setCustomer_id(request.getCustomer_id());
        orderEntity.setProduct_id(request.getProduct_id());
        orderEntity.setQuantity(request.getQuantity());
        orderEntity.setPayment_method(request.getPayment_method());
        orderEntity.setDelivery_address(request.getDelivery_address());

        // Generate a unique order ID for the customer
        int id = (int) (Math.random() * 9000) + 100000;
        orderEntity.setOrder_id(id);

        // Save the OrderEntity into the database
        // save() returns the saved entity
        OrderEntity responseEntity = orderRepository.save(orderEntity);

        // Create a Response DTO to send data back to the client
        OrderResponse orderResponse = new OrderResponse();

        // Copy required data from Entity to Response DTO
        orderResponse.setCustomerId(responseEntity.getCustomer_id());
        orderResponse.setOrderId(responseEntity.getOrder_id());

        // Set the initial order and payment status
        orderResponse.setOrderStatus("Placed");
        orderResponse.setPaymentStatus("PAID");

        // Set the total amount
        orderResponse.setTotalAmount(id);

        // Return the response to the Controller
        return orderResponse;
    }
}