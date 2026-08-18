package com.ownly.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ownly.search.entity.SearchEntity;
import com.ownly.search.repository.SearchRepository;
import com.ownly.search.response.SearchResponse;

@Service
public class SearchService {
	
	@Autowired
	SearchRepository searchRepository;
	
	
	public SearchResponse getProductById(String orderId) {
		
		SearchEntity searchEntity = searchRepository.findByOrderId(orderId).get();
		
		SearchResponse response = new SearchResponse();
		
		response.setOrderId(searchEntity.getOrderId());
		response.setProduct_id(searchEntity.getProduct_id());
		response.setProduct_name(searchEntity.getProduct_name());
		response.setPrice(searchEntity.getPrice());
		response.setQuantity(searchEntity.getQuantity());
		
		return response;
	}
	
	

}
