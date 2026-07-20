package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecommerce.model.Seller;
import com.ecommerce.util.DBConnection;

public class SellerDAO {

    // Register Seller
    public boolean registerSeller(Seller seller) {

        String sql = "INSERT INTO sellers(name,email,password,shop_name) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) { 

            ps.setString(1, seller.getName());
            ps.setString(2, seller.getEmail());
            ps.setString(3, seller.getPassword());
            ps.setString(4, seller.getShopName());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {

            System.out.println("Seller Registration Failed.");

        }

        return false;
    }

    // Seller Login
    public Seller loginSeller(String email, String password) {

        String sql = "SELECT * FROM sellers WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Seller seller = new Seller();

                seller.setSellerId(rs.getInt("seller_id"));
                seller.setName(rs.getString("name"));
                seller.setEmail(rs.getString("email"));
                seller.setPassword(rs.getString("password"));
                seller.setShopName(rs.getString("shop_name"));

                return seller;
            }

        } catch (SQLException e) {

            System.out.println("Login Failed.");

        }

        return null;
    }

    // Check Email
    public boolean emailExists(String email) {

        String sql = "SELECT seller_id FROM sellers WHERE email=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return false;
    }

}