package com.blinkit.orderpayment.controller;

import com.blinkit.orderpayment.exception.PaymentFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PaymentFailedException.class)
    public ResponseEntity<Map<String, String>> handlePaymentFailure(
            PaymentFailedException ex) {

        return ResponseEntity.status(HttpStatus.PAYMENT_REQUIRED)
                .body(Map.of(
                        "error", "PAYMENT_FAILED",
                        "message", ex.getMessage(),
                        "rollback", "Order transaction rolled back"
                ));
    }
}
