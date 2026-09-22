package com.blinkit.orderpayment.dto;

import com.blinkit.orderpayment.entity.OrderStatus;

import java.math.BigDecimal;

public class OrderResponse {

    private Long orderId;
    private Long customerId;
    private BigDecimal amount;
    private OrderStatus status;
    private String message;

    public OrderResponse() {
    }

    public OrderResponse(Long orderId, Long customerId, BigDecimal amount,
                         OrderStatus status, String message) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
        this.message = message;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}