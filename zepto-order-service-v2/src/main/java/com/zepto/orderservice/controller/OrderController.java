package com.zepto.orderservice.controller;

import com.zepto.orderservice.dto.CreateOrderRequest;
import com.zepto.orderservice.entity.Order;
import com.zepto.orderservice.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Order createOrder(@RequestBody CreateOrderRequest request) {
		return orderService.createOrder(request);
	}

	@GetMapping
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@GetMapping("/{id}")
	public Order getOrder(@PathVariable Long id) {
		return orderService.getOrder(id);
	}

	@GetMapping("/user/{userId}")
	public List<Order> getOrdersByUser(@PathVariable Long userId) {
		return orderService.getOrdersByUser(userId);
	}

	@PutMapping("/{id}/cancel")
	public Order cancelOrder(@PathVariable Long id) {
		return orderService.cancelOrder(id);
	}
}