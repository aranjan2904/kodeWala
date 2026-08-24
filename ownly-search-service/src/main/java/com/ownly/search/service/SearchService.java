package com.ownly.search.service;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public List<SearchResponse> getProductByPrice(double price){
		
		 List<SearchEntity> list = searchRepository.findByPrice(price);
		 
		 List<SearchResponse>  responseList = new ArrayList<SearchResponse>();
		 
		 for(SearchEntity entity : list) {
			 
			 SearchResponse response = new SearchResponse();
			 
			 response.setOrderId(entity.getOrderId());
			 response.setProduct_id(entity.getProduct_id());
			 response.setProduct_name(entity.getProduct_name());
			 response.setPrice(entity.getPrice());
			 response.setQuantity(entity.getQuantity());
			 
			 responseList.add(response);
		 }
		 
		 return responseList;
	}
	
	

}
