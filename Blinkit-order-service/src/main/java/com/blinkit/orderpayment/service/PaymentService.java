package com.blinkit.orderpayment.service;

import com.blinkit.orderpayment.entity.Payment;
import com.blinkit.orderpayment.entity.PaymentStatus;
import com.blinkit.orderpayment.exception.PaymentFailedException;
import com.blinkit.orderpayment.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment makePayment(Long orderId,
                               BigDecimal amount,
                               boolean paymentSuccess) {

        if (!paymentSuccess) {
            throw new PaymentFailedException(
                    "Payment failed for order " + orderId
            );
        }

        Payment payment = new Payment();

        payment.setOrderId(orderId);
        payment.setAmount(amount);
        payment.setStatus(PaymentStatus.SUCCESS);
        payment.setPaidAt(LocalDateTime.now());

        return paymentRepository.save(payment);
    }
}