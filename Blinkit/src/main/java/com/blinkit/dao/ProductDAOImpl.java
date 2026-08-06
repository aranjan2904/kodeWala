package com.blinkit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.blinkit.model.Product;
import com.blinkit.util.DBConnection;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Override
    public List<Product> getAllProducts() {

        List<Product> productList = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try {
        	Connection connection = DBConnection.getConnection();

        	System.out.println(connection);

        	PreparedStatement preparedStatement = connection.prepareStatement(sql);

        	ResultSet resultSet = preparedStatement.executeQuery();

        	while(resultSet.next()) {

        	    System.out.println("Found : " + resultSet.getString("product_name"));

        	    Product product = new Product();

        	    product.setProductId(resultSet.getInt("product_id"));
        	    product.setProductName(resultSet.getString("product_name"));
        	    product.setCategory(resultSet.getString("category"));
        	    product.setPrice(resultSet.getDouble("price"));
        	    product.setStock(resultSet.getInt("stock"));

        	    productList.add(product);
        	}

        	System.out.println(productList);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }
    
    @Override
    public List<Product> searchProducts(String keyword) {

        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM products WHERE product_name LIKE ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));

                products.add(product);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}