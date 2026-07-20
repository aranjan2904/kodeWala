package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecommerce.model.CartItem;
import com.ecommerce.util.DBConnection;

public class CartDAO {

    // Add Product to Cart
    public boolean addToCart(CartItem item) {

        String sql = "INSERT INTO cart(customer_id,product_id,quantity) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, item.getCustomerId());
            ps.setInt(2, item.getProductId());
            ps.setInt(3, item.getQuantity());

            return ps.executeUpdate() > 0; 

        } catch (SQLException e) {

            System.out.println("Unable to add product into cart.");

        }

        return false;
    }

    // View Cart
    public ArrayList<CartItem> getCartItems(int customerId) {

        ArrayList<CartItem> list = new ArrayList<>();

        String sql = "SELECT * FROM cart WHERE customer_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                CartItem item = new CartItem();

                item.setCartId(rs.getInt("cart_id"));
                item.setCustomerId(rs.getInt("customer_id"));
                item.setProductId(rs.getInt("product_id"));
                item.setQuantity(rs.getInt("quantity"));
                item.setAddedAt(rs.getTimestamp("added_at")); 

                list.add(item);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return list;
    }

    // Update Quantity
    public boolean updateQuantity(int cartId, int quantity) {

        String sql = "UPDATE cart SET quantity=? WHERE cart_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, quantity);
            ps.setInt(2, cartId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;
    }

    // Remove One Item
    public boolean removeItem(int cartId) {

        String sql = "DELETE FROM cart WHERE cart_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, cartId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;
    }

    // Empty Cart
    public boolean clearCart(int customerId) {

        String sql = "DELETE FROM cart WHERE customer_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return false;
    }

}