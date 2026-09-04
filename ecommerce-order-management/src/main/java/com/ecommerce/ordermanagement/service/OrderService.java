package com.ecommerce.ordermanagement.service;

import org.springframework.stereotype.Service;

import com.ecommerce.ordermanagement.entity.Customer;
import com.ecommerce.ordermanagement.entity.Order;
import com.ecommerce.ordermanagement.repository.CustomerRepository;
import com.ecommerce.ordermanagement.repository.OrderRepository;

@Service
public class OrderService {

	private final CustomerRepository customerRepository;
	private final OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository) {
		this.orderRepository = orderRepository;
		this.customerRepository = customerRepository;
	}
	
	public Order createOrder(Long customerId, Order order) {
		
		 Customer customer = customerRepository.findById(customerId).orElse(null);
		 
		 order.setCustomer(customer);
		 
		 
		return orderRepository.save(order);
	}
	
}
