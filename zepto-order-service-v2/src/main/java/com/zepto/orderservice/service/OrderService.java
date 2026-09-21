package com.zepto.orderservice.service;

import com.zepto.orderservice.dto.CreateOrderRequest;
import com.zepto.orderservice.entity.Order;
import java.util.List;

public interface OrderService {
	Order createOrder(CreateOrderRequest request);

	Order getOrder(Long id);

	List<Order> getAllOrders();

	List<Order> getOrdersByUser(Long userId);

	Order cancelOrder(Long id);
}