package com.blinkit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blinkit.dao.ProductDAO;
import com.blinkit.dao.ProductDAOImpl;
import com.blinkit.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

    
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
    
    @Override
    public List<Product> searchProducts(String keyword) {
        return productDAO.searchProducts(keyword);
    }
}