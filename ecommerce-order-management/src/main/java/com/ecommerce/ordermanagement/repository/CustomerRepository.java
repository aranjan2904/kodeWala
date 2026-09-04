package com.ecommerce.ordermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ordermanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
//	@Query("SELECT DISTINCT c FROM Customer c LEFT JOIN FETCH c.orders")
//	List<Customer> findAllWithOrders();
	
	
	@EntityGraph(attributePaths = "orders")
	List<Customer> findAll();

}