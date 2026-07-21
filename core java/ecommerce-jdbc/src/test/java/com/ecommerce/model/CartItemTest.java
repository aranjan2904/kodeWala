package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CartItemTest {

    @Test
    void testDefaultConstructorAndSetters() {

        CartItem cartItem = new CartItem();

        cartItem.setCartId(1);
        cartItem.setCustomerId(101);
        cartItem.setProductId(10);
        cartItem.setQuantity(5);

        assertEquals(1, cartItem.getCartId());
        assertEquals(101, cartItem.getCustomerId());
        assertEquals(10, cartItem.getProductId());
        assertEquals(5, cartItem.getQuantity());
    }

    @Test
    void testParameterizedConstructorWithoutCartId() {

        CartItem cartItem = new CartItem(
                101,
                10,
                3);

        assertEquals(101, cartItem.getCustomerId());
        assertEquals(10, cartItem.getProductId());
        assertEquals(3, cartItem.getQuantity());
    }

    @Test
    void testParameterizedConstructorWithCartId() {

        CartItem cartItem = new CartItem(
                1,
                101,
                10,
                4);

        assertEquals(1, cartItem.getCartId());
        assertEquals(101, cartItem.getCustomerId());
        assertEquals(10, cartItem.getProductId());
        assertEquals(4, cartItem.getQuantity());
    }

    @Test
    void testObjectNotNull() {

        CartItem cartItem = new CartItem();

        assertNotNull(cartItem);
    }

}