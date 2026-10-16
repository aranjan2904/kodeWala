package com.flipkart.order.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.flipkart.order.entity.OrderEntity;
import com.flipkart.order.entity.OrderStatus;

public record OrderResponse(
        Long id,
        Long customerId,
        Long productId,
        Integer quantity,
        BigDecimal unitPrice,
        BigDecimal totalAmount,
        OrderStatus status,
        LocalDateTime createdAt
) {
    public static OrderResponse from(OrderEntity order) {
        return new OrderResponse(
                order.getId(),
                order.getCustomerId(),
                order.getProductId(),
                order.getQuantity(),
                order.getUnitPrice(),
                order.getTotalAmount(),
                order.getStatus(),
                order.getCreatedAt()
        );
    }
}
