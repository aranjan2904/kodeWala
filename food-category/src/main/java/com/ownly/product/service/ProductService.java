package com.ownly.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ownly.product.repository.ProductRepository;
import com.ownly.product.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void createProduct(@RequestBody ProductRequest productRequest) {
		
		
	}
}
