package com.ownly.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ownly.order.entity.OrderEntity;
import com.ownly.order.request.OrderRequest;
import com.ownly.order.response.OrderResponse;
import com.ownly.order.service.OrderService;

@RestController
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping("/order/place")
	public OrderResponse placeOrder(@RequestBody OrderRequest request) {
		
		
		return orderService.placeOrder(request);
	}
	
	@GetMapping("/order/{orderId}")
	public OrderEntity getOrder(@PathVariable int orderId) {
		
		return orderService.getOrderById(orderId);
	}
	
}
