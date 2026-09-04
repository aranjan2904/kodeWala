package com.ecommerce.ordermanagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ordermanagement.entity.Order;
import com.ecommerce.ordermanagement.service.OrderService;

@RestController
@RequestMapping("/customers")
public class OrderController {
	
	private final OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping("/{customerId}/orders")
	public Order createOrder( @PathVariable Long customerId, @RequestBody Order order) {
		
		return orderService.createOrder(customerId, order);
	}

}
