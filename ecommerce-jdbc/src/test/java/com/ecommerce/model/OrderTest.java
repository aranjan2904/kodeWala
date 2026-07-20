package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void testDefaultConstructorAndSetters() {

        Order order = new Order();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        order.setOrderId(1);
        order.setCustomerId(101);
        order.setTotalAmount(2500.50);
        order.setStatus("PLACED");
        order.setCreatedAt(timestamp);

        assertEquals(1, order.getOrderId());
        assertEquals(101, order.getCustomerId());
        assertEquals(2500.50, order.getTotalAmount());
        assertEquals("PLACED", order.getStatus());
        assertEquals(timestamp, order.getCreatedAt());
    }

    @Test
    void testConstructorWithoutOrderId() {

        Order order = new Order(
                102,
                999.99,
                "PENDING");

        assertEquals(102, order.getCustomerId());
        assertEquals(999.99, order.getTotalAmount());
        assertEquals("PENDING", order.getStatus());
    }

    @Test
    void testConstructorWithOrderId() {

        Order order = new Order(
                5,
                103,
                1500.00,
                "DELIVERED");

        assertEquals(5, order.getOrderId());
        assertEquals(103, order.getCustomerId());
        assertEquals(1500.00, order.getTotalAmount());
        assertEquals("DELIVERED", order.getStatus()); 
    }

    @Test
    void testCreatedAtCanBeNull() {

        Order order = new Order();

        assertNull(order.getCreatedAt());

        order.setCreatedAt(null);

        assertNull(order.getCreatedAt());
    }
}