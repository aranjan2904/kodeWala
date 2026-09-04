package com.ecommerce.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ordermanagement.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}