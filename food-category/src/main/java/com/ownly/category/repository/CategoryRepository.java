package com.ownly.category.repository;

import org.springframework.data.repository.CrudRepository;

import com.ownly.category.entity.CategoryEntity;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long>{

}
