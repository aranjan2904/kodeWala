package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.ecommerce.model.Customer;
import com.ecommerce.util.DBConnection;

public class CustomerDAO {

    // Register Customer
    public boolean registerCustomer(Customer customer) {

        String sql = "INSERT INTO customers(name,email,password,address) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getAddress());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLIntegrityConstraintViolationException e) {

            // Duplicate email
            System.out.println("Email already exists.");
            return false;

        } catch (SQLException e) {

            // Unexpected database error
            System.out.println("Registration Failed.");
            e.printStackTrace();
            return false;
        }
    }

    // Customer Login
    public Customer loginCustomer(String email, String password) {

        String sql = "SELECT * FROM customers WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Customer customer = new Customer();

                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setName(rs.getString("name"));
                customer.setEmail(rs.getString("email"));
                customer.setPassword(rs.getString("password"));
                customer.setAddress(rs.getString("address"));

                return customer;
            }

        } catch (SQLException e) {

            System.out.println("Login Failed.");
            e.printStackTrace();
        }

        return null;
    }

    // Check Email Already Exists
    public boolean emailExists(String email) {

        String sql = "SELECT customer_id FROM customers WHERE email=?";

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