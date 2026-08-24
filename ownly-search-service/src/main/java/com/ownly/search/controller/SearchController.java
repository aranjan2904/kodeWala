package com.ownly.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ownly.search.response.SearchResponse;
import com.ownly.search.service.SearchService;

@RestController
@RequestMapping("orders/")
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	@GetMapping("/{orderId}")
	public SearchResponse getOrderById(@PathVariable("orderId") String orderId) {
		
			return	searchService.getProductById(orderId);
	}
	
	@GetMapping("/findOrder")
	public List<SearchResponse> getOrderByPrice(@RequestParam("price") double price){
		
		return searchService.getProductByPrice(price); 
	}
}
