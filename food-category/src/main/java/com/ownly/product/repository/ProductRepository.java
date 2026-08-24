package com.ownly.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.ownly.product.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Long>{
	
	

}
