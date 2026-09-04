package com.ownly.product.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ownly.category.entity.CategoryEntity;
import com.ownly.product.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Long>{
	
	Optional<CategoryEntity> findByName(String name);

}
