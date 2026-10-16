package com.flipkart.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flipkart.order.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
