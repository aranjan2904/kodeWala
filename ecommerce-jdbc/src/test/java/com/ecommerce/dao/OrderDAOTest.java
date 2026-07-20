package com.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.Order;

class OrderDAOTest {

    private OrderDAO orderDAO;
    private CartDAO cartDAO;

    @BeforeEach
    void setUp() {

        orderDAO = new OrderDAO();
        cartDAO = new CartDAO();

        cartDAO.clearCart(1);
    }

    @Test
    void testGetOrders() {

        ArrayList<Order> orders = orderDAO.getOrders(1);

        assertNotNull(orders);

    }

    @Test
    void testGetOrdersForInvalidCustomer() {

        ArrayList<Order> orders = orderDAO.getOrders(99999);

        assertTrue(orders.isEmpty());

    }

    @Test
    void testPlaceOrderSuccess() {

        cartDAO.clearCart(1);

        CartItem item = new CartItem(1, 1, 1);

        cartDAO.addToCart(item);

        ArrayList<CartItem> cartItems =
                cartDAO.getCartItems(1);

        boolean placed =
                orderDAO.placeOrder(1, cartItems);

        assertTrue(placed);

    }

    @Test
    void testPlaceOrderWithInvalidProduct() {

        ArrayList<CartItem> cartItems = new ArrayList<>();

        cartItems.add(new CartItem(1, 99999, 1));

        assertFalse(orderDAO.placeOrder(1, cartItems));

    }

    @Test
    void testPlaceOrderInsufficientStock() {

        ArrayList<CartItem> cartItems = new ArrayList<>();

        cartItems.add(new CartItem(1, 1, 999999));

        assertFalse(orderDAO.placeOrder(1, cartItems));

    }

}