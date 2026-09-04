package com.ecommerce.ordermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ordermanagement.entity.Customer;
import com.ecommerce.ordermanagement.repository.CustomerRepository;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	
}
