package com.ownly.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ownly.category.dto.request.CategoryRequest;
import com.ownly.category.dto.response.CategoryResponse;
import com.ownly.category.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/create")
	public ResponseEntity<CategoryResponse> crateCategory(@RequestBody CategoryRequest categoryRequest) {
		
		CategoryResponse response =  categoryService.createCategory(categoryRequest);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}
