package com.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.model.CartItem;

public class CartDAOTest {

    private CartDAO cartDAO;

    @BeforeEach
    void setUp() {

        cartDAO = new CartDAO();

        // Clean previous test data
        cartDAO.clearCart(1);
    }

    @Test
    void testAddToCart() {

        CartItem item = new CartItem(1, 1, 2);

        assertTrue(cartDAO.addToCart(item));
    }

    @Test
    
    void testGetCartItems() {

        CartItem item = new CartItem(1, 1, 2);

        cartDAO.addToCart(item);

        ArrayList<CartItem> list = cartDAO.getCartItems(1);

        assertFalse(list.isEmpty());
    }

    @Test
    void testUpdateQuantity() {

        CartItem item = new CartItem(1, 1, 2);

        cartDAO.addToCart(item);

        int cartId = cartDAO.getCartItems(1).get(0).getCartId();

        assertTrue(cartDAO.updateQuantity(cartId, 5));
    }

    @Test
    void testRemoveItem() {

        CartItem item = new CartItem(1, 1, 2);

        cartDAO.addToCart(item);

        int cartId = cartDAO.getCartItems(1).get(0).getCartId();

        assertTrue(cartDAO.removeItem(cartId));
    }

    @Test
    void testClearCart() {

        cartDAO.addToCart(new CartItem(1,1,1));
        cartDAO.addToCart(new CartItem(1,1,2));

        assertTrue(cartDAO.clearCart(1));
    }

    @Test
    void testGetCartItemsEmpty() {

        cartDAO.clearCart(1);

        assertTrue(cartDAO.getCartItems(1).isEmpty());
    }

}