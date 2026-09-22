package com.blinkit.orderpayment.service;

import com.blinkit.orderpayment.dto.CreateOrderRequest;
import com.blinkit.orderpayment.dto.OrderResponse;
import com.blinkit.orderpayment.entity.Order;
import com.blinkit.orderpayment.entity.OrderStatus;
import com.blinkit.orderpayment.exception.PaymentFailedException;
import com.blinkit.orderpayment.kafka.OrderCreatedEvent;
import com.blinkit.orderpayment.kafka.OrderProducer;
import com.blinkit.orderpayment.repository.OrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final PaymentService paymentService;
    
    private final OrderProducer orderProducer;


    // Manual constructor
    public OrderService(OrderRepository orderRepository,
                        PaymentService paymentService,
                        OrderProducer orderProducer) {

        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
		this.orderProducer = orderProducer;
    }


    /*
     * ONE database transaction:
     *
     * 1. Save order
     * 2. Process payment
     * 3. Confirm order
     *
     * If payment fails,
     * the transaction will be rolled back.
     */

    @Transactional
    public OrderResponse createOrder(CreateOrderRequest request) {

        // Create Order manually
        Order order = new Order();

        order.setCustomerId(request.getCustomerId());
        order.setAmount(request.getAmount());
        order.setStatus(OrderStatus.CREATED);
        order.setCreatedAt(LocalDateTime.now());


        // Save order
        order = orderRepository.save(order);

        OrderCreatedEvent event = new OrderCreatedEvent(
        		order.getId(),
        		order.getCustomerId(),
        		order.getAmount()
        		);
        
        orderProducer.sendOrderCreatedEvent(event);

        try {

            // Process payment
            paymentService.makePayment(
                    order.getId(),
                    order.getAmount(),
                    request.isPaymentSuccess()
            );


            // Payment successful
            order.setStatus(OrderStatus.CONFIRMED);

            orderRepository.save(order);


            // Create response manually
            OrderResponse response = new OrderResponse();

            response.setOrderId(order.getId());
            response.setCustomerId(order.getCustomerId());
            response.setAmount(order.getAmount());
            response.setStatus(order.getStatus());
            response.setMessage("Order created and payment successful");

            return response;


        } catch (PaymentFailedException ex) {

            /*
             * Don't swallow the exception.
             *
             * Re-throwing the RuntimeException tells Spring
             * to rollback the @Transactional method.
             */

            throw ex;
        }
    }
}