package com.ecommerce.service;

import java.util.ArrayList;

import com.ecommerce.dao.CartDAO;
import com.ecommerce.dao.OrderDAO;
import com.ecommerce.exception.EmptyCartException;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Order;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();
    private CartDAO cartDAO = new CartDAO();

    // Place Order
    public void placeOrder(int customerId) {

        ArrayList<CartItem> cartItems = cartDAO.getCartItems(customerId);

        if (cartItems.isEmpty()) {

        	throw new EmptyCartException("Your cart is Empty");
           // System.out.println("\nYour Cart Is Empty.");
           // return;
        	
        } 

        boolean placed = orderDAO.placeOrder(customerId, cartItems);

        if (placed) {

            System.out.println("\n==================================");
            System.out.println("Order Placed Successfully.");
            System.out.println("==================================");

        } else {

            System.out.println("\nUnable To Place Order.");
        }
 
    }

    // View Order History
    public void viewOrders(int customerId) {

        ArrayList<Order> orders = orderDAO.getOrders(customerId);

        if (orders.isEmpty()) {

            System.out.println("\nNo Orders Found.");
            return;
        }

        System.out.println("\n============== ORDER HISTORY ==============");

        for (Order order : orders) {

            System.out.println("------------------------------------------");
            System.out.println("Order Id      : " + order.getOrderId());
            System.out.println("Total Amount  : ₹" + order.getTotalAmount());
            System.out.println("Status        : " + order.getStatus());
            System.out.println("Order Placed On : "+ order.getCreatedAt());

        }

    }

}