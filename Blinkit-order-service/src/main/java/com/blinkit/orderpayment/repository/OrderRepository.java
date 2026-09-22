package com.blinkit.orderpayment.repository;

import com.blinkit.orderpayment.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
