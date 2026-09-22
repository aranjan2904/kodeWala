package com.blinkit.notification.kafka;

import java.math.BigDecimal;

public class OrderCreatedEvent {

    private Long orderId;

    private Long customerId;

    private BigDecimal amount;


    public OrderCreatedEvent() {
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
}