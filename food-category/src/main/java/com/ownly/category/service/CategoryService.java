package com.ownly.category.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ownly.category.dto.request.CategoryRequest;
import com.ownly.category.dto.response.CategoryResponse;
import com.ownly.category.entity.CategoryEntity;
import com.ownly.category.repository.CategoryRepository;

public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public CategoryResponse createCategory(CategoryRequest categoryRequest) {
		
		CategoryEntity categoryEntity = new CategoryEntity();
		
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDiscription());
		categoryEntity.setStatus("Active");
		
		CategoryEntity responEntity = categoryRepository.save(categoryEntity);
		
		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.setId(responEntity.getId());
		categoryResponse.setName(responEntity.getName());
		categoryResponse.setDescription(responEntity.getDescription());
		categoryResponse.setStatus(responEntity.getStatus());
		
		
		
		return categoryResponse;
		
	}
	

}
