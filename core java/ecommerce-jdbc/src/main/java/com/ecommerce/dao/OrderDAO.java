package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.Order;
import com.ecommerce.model.Product;
import com.ecommerce.util.DBConnection;

public class OrderDAO {

    ProductDAO productDAO = new ProductDAO();
    CartDAO cartDAO = new CartDAO();

    // Place Order
    public boolean placeOrder(int customerId, ArrayList<CartItem> cartItems) {

        Connection con = null;

        try { 

            con = DBConnection.getConnection();
            con.setAutoCommit(false); 

            double totalAmount = 0;

            // Calculate Total Amount
            for (CartItem item : cartItems) {

                Product product = productDAO.getProductById(item.getProductId());

                if (product == null) {
                    con.rollback();
                    return false;
                }

                if (product.getStockQuantity() < item.getQuantity()) {
                    con.rollback();
                    return false;
                }

                totalAmount += product.getPrice() * item.getQuantity();
            }

            // Create Order
            String orderSql = "INSERT INTO orders(customer_id,total_amount,status) VALUES(?,?,?)";

            PreparedStatement orderPs = con.prepareStatement(orderSql,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            orderPs.setInt(1, customerId);
            orderPs.setDouble(2, totalAmount);
            orderPs.setString(3, "PLACED");

            orderPs.executeUpdate();

            ResultSet rs = orderPs.getGeneratedKeys();

            int orderId = 0;

            if (rs.next()) {
                orderId = rs.getInt(1);
            }

            // Save Order Items
            String itemSql = "INSERT INTO order_items(order_id,product_id,quantity,price) VALUES(?,?,?,?)";

            PreparedStatement itemPs = con.prepareStatement(itemSql);

            // Update Stock
            String updateSql = "UPDATE products SET stock_quantity=? WHERE product_id=?";

            PreparedStatement stockPs = con.prepareStatement(updateSql);

            for (CartItem item : cartItems) {

                Product product = productDAO.getProductById(item.getProductId());

                itemPs.setInt(1, orderId);
                itemPs.setInt(2, product.getProductId());
                itemPs.setInt(3, item.getQuantity());
                itemPs.setDouble(4, product.getPrice());

                itemPs.executeUpdate();

                stockPs.setInt(1,
                        product.getStockQuantity() - item.getQuantity());

                stockPs.setInt(2, product.getProductId());

                stockPs.executeUpdate();
            }

            con.commit();

            cartDAO.clearCart(customerId);

            return true;

        } catch (Exception e) {

            try {

                if (con != null)
                    con.rollback();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            try {

                if (con != null)
                    con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return false;
    }

    // View Order History
    public ArrayList<Order> getOrders(int customerId) {

        ArrayList<Order> orders = new ArrayList<>();

        String sql = "SELECT * FROM orders WHERE customer_id=? ORDER BY order_id DESC";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Order order = new Order();

                order.setOrderId(rs.getInt("order_id"));
                order.setCustomerId(rs.getInt("customer_id"));
                order.setTotalAmount(rs.getDouble("total_amount"));
                order.setStatus(rs.getString("status"));
                order.setCreatedAt(rs.getTimestamp("created_at"));

                orders.add(order);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return orders;
    }

}