package com.ecommerce.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecommerce.model.Product;
import com.ecommerce.util.DBConnection;

public class ProductDAO {

    // Add Product
    public boolean addProduct(Product product) {

        String sql = "INSERT INTO products(seller_id,name,description,price,stock_quantity) VALUES(?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, product.getSellerId());
            ps.setString(2, product.getName());
            ps.setString(3, product.getDescription());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getStockQuantity());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Unable to add product.");
        } 

        return false;
    }
    
    //upload product via csv file
    public int uploadProducts(String filePath, int sellerId) {

        String sql = "INSERT INTO products(seller_id,name,description,price,stock_quantity) VALUES(?,?,?,?,?)";

        int totalInserted = 0;

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                BufferedReader br = new BufferedReader(new FileReader(filePath))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                ps.setInt(1, sellerId);
                ps.setString(2, data[0].trim());
                ps.setString(3, data[1].trim());
                ps.setDouble(4, Double.parseDouble(data[2].trim()));
                ps.setInt(5, Integer.parseInt(data[3].trim()));

                ps.addBatch();
                totalInserted++;
            }

            ps.executeBatch();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return totalInserted;
    }

    // View All Products
    public ArrayList<Product> getAllProducts() {

        ArrayList<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setSellerId(rs.getInt("seller_id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStockQuantity(rs.getInt("stock_quantity"));

                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Search Product
    public ArrayList<Product> searchProduct(String keyword) {

        ArrayList<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM products WHERE name LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setSellerId(rs.getInt("seller_id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStockQuantity(rs.getInt("stock_quantity"));

                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Find Product By Id
    public Product getProductById(int productId) {

        String sql = "SELECT * FROM products WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setSellerId(rs.getInt("seller_id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStockQuantity(rs.getInt("stock_quantity"));

                return product;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // View Seller Products
    public ArrayList<Product> getSellerProducts(int sellerId) {

        ArrayList<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM products WHERE seller_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, sellerId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setSellerId(rs.getInt("seller_id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStockQuantity(rs.getInt("stock_quantity"));

                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Update Product
    public boolean updateProduct(Product product) {

        String sql = "UPDATE products SET name=?,description=?,price=?,stock_quantity=? WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getStockQuantity());
            ps.setInt(5, product.getProductId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Delete Product
    public boolean deleteProduct(int productId) {

        String sql = "DELETE FROM products WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}