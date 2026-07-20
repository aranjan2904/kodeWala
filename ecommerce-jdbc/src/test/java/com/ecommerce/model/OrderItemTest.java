package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OrderItemTest {

    @Test
    void testDefaultConstructorAndSetters() {

        OrderItem orderItem = new OrderItem();

        orderItem.setOrderItemId(1);
        orderItem.setOrderId(100);
        orderItem.setProductId(10);
        orderItem.setQuantity(2);
        orderItem.setPrice(499.99);

        assertEquals(1, orderItem.getOrderItemId());
        assertEquals(100, orderItem.getOrderId());
        assertEquals(10, orderItem.getProductId());
        assertEquals(2, orderItem.getQuantity());
        assertEquals(499.99, orderItem.getPrice());
    }

    @Test
    void testParameterizedConstructorWithoutId() {

        OrderItem orderItem = new OrderItem(
                100,
                10,
                3,
                999.99);

        assertEquals(100, orderItem.getOrderId());
        assertEquals(10, orderItem.getProductId());
        assertEquals(3, orderItem.getQuantity());
        assertEquals(999.99, orderItem.getPrice());
    }

    @Test
    void testParameterizedConstructorWithId() {

        OrderItem orderItem = new OrderItem(
                1,
                100,
                10,
                5,
                1999.99);

        assertEquals(1, orderItem.getOrderItemId());
        assertEquals(100, orderItem.getOrderId());
        assertEquals(10, orderItem.getProductId());
        assertEquals(5, orderItem.getQuantity());
        assertEquals(1999.99, orderItem.getPrice());
    }

    @Test
    void testObjectNotNull() {

        OrderItem orderItem = new OrderItem();

        assertNotNull(orderItem);
    }

}