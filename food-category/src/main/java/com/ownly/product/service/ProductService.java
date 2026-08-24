package com.ownly.product.service;

import com.ownly.category.entity.CategoryEntity;
import com.ownly.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ownly.product.entity.ProductEntity;
import com.ownly.product.repository.ProductRepository;
import com.ownly.product.request.ProductRequest;
import com.ownly.product.response.ProductResponse;

@Service
public class ProductService {

	private final CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;

	ProductService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public ProductResponse createProduct(ProductRequest productRequest) {
		
		String categoryName = productRequest.getCategoryName();
		
		CategoryEntity parentEntity = 	 categoryRepository.findById(Long.valueOf(categoryName)).orElseThrow(() -> new RuntimeException("Category not found"));
		
		ProductEntity product = new ProductEntity();
		
		product.setCategory(parentEntity);
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
		product.setDescription(productRequest.getDescription());
		
		ProductEntity responseEntity = productRepository.save(product);
		
		ProductResponse response = new ProductResponse();
		
		response.setId(responseEntity.getId());
		response.setName(responseEntity.getName());
		response.setCategoryName(responseEntity.getCategory().getName());
		response.setDescription(responseEntity.getDescription());
		response.setPrice(responseEntity.getPrice());
		response.setStatus(responseEntity.getStatus());
		
		return response;
		
		
	}
}
