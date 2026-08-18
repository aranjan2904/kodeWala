package com.ownly.search.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ownly.search.entity.SearchEntity;


public interface SearchRepository extends CrudRepository<SearchEntity, Integer>{

	Optional<SearchEntity> findByOrderId(String orderId);
	
}
