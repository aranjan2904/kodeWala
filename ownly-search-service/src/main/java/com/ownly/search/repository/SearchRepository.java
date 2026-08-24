package com.ownly.search.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ownly.search.entity.SearchEntity;

@Repository
public interface SearchRepository extends CrudRepository<SearchEntity, Integer>{

	 public Optional<SearchEntity> findByOrderId(String orderId);
	 
	 
	 @Query("SELECT o FROM SearchEntity o WHERE o.price > :price")
	 public List<SearchEntity> findByPrice(@Param("price") double price);
	
   
	
}
