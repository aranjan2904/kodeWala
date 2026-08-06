package com.blinkit.service;

import java.util.List;
import com.blinkit.model.Product;

public interface ProductService {

    List<Product> getAllProducts();
    
    List<Product> searchProducts(String keyword);

}