package com.blinkit.dao;

import java.util.List;
import com.blinkit.model.Product;

public interface ProductDAO {

    List<Product> getAllProducts();
    
    List<Product> searchProducts(String keyword);

}