package com.zepto.orderservice.service;

import com.zepto.orderservice.dto.CreateOrderRequest;
import com.zepto.orderservice.entity.Order;
import com.zepto.orderservice.kafka.OrderCreatedEvent;
import com.zepto.orderservice.kafka.OrderProducer;
import com.zepto.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
	private final OrderRepository orderRepository;
	
	private final OrderProducer orderProducer;
	

	public OrderServiceImpl(OrderRepository orderRepository, OrderProducer orderProducer) {
		this.orderRepository = orderRepository;
		this.orderProducer = orderProducer;
	}

	@Override
	public Order createOrder(CreateOrderRequest request) {

	    Order order = new Order();

	    order.setUserId(request.getUserId());
	    order.setProductName(request.getProductName());
	    order.setQuantity(request.getQuantity());
	    order.setTotalAmount(request.getTotalAmount());
	    order.setStatus("CREATED");
	    order.setCreatedAt(LocalDateTime.now());

	    Order savedOrder = orderRepository.save(order);

	    OrderCreatedEvent event = new OrderCreatedEvent(
	            savedOrder.getId(),
	            savedOrder.getUserId(),
	            savedOrder.getProductName(),
	            savedOrder.getQuantity(),
	            savedOrder.getTotalAmount()
	    );

	    orderProducer.sendOrderCreatedEvent(event);

	    return savedOrder;
	}

	@Override
	public Order getOrder(Long id) {
		return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found: " + id));
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<Order> getOrdersByUser(Long userId) {
		return orderRepository.findByUserId(userId);
	}

	@Override
	public Order cancelOrder(Long id) {
		
		Order order = getOrder(id);
		order.setStatus("CANCELLED");
		
		return orderRepository.save(order);
	}
}