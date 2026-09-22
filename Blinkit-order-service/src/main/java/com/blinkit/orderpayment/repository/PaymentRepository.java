package com.blinkit.orderpayment.repository;

import com.blinkit.orderpayment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
