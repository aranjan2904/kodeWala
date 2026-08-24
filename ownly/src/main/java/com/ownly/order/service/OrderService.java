package com.ownly.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ownly.order.entity.OrderEntity;
import com.ownly.order.entity.PaymentEntity;
import com.ownly.order.exception.OrderNotFoundException;
import com.ownly.order.repository.OrderRepository;
import com.ownly.order.repository.PaymentRepository;
import com.ownly.order.request.OrderRequest;
import com.ownly.order.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private PaymentRepository paymentRepository;
    
    

    @Transactional
    public OrderResponse placeOrder(OrderRequest request) {

        // Create entity
        OrderEntity order = new OrderEntity();

        order.setCustomer_id(request.getCustomer_id());
        order.setProduct_id(request.getProduct_id());
        order.setQuantity(request.getQuantity());
        order.setPayment_method(request.getPayment_method());
        order.setDelivery_address(request.getDelivery_address());

        // Generate order ID
        int orderId = (int) (Math.random() * 9000) + 100000;
        order.setOrder_id(orderId);

        // Save to database
        OrderEntity savedOrder = orderRepository.save(order);
        
        
        //payment
        PaymentEntity payment = new PaymentEntity();
        payment.setOrder_id(savedOrder.getOrder_id());
        payment.setPayment_method(request.getPayment_method());
        payment.setPayment_status("PAID");
        payment.setAmount(50000);
        
        paymentRepository.save(payment);

        

        // Create response
        OrderResponse response = new OrderResponse();

        response.setCustomerId(savedOrder.getCustomer_id());
        response.setOrderId(savedOrder.getOrder_id());
        response.setOrderStatus("Placed");
        response.setPaymentStatus("PAID");
        response.setTotalAmount(50000);

        return response;
    }
    
    
    public OrderEntity getOrderById(int orderId) {
    	
    	Optional<OrderEntity> order = orderRepository.findById(orderId);

    	if (order.isEmpty()) {
    	    throw new OrderNotFoundException("Order not found: " + orderId);
    	}

    	return order.get();
    }
}