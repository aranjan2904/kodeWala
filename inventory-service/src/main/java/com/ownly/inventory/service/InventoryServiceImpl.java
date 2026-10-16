package com.ownly.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ownly.inventory.dto.InventoryRequest;
import com.ownly.inventory.dto.InventoryResponse;
import com.ownly.inventory.entity.Inventory;
import com.ownly.inventory.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	private final InventoryRepository inventoryRepository;
	
	private static final Logger log = LoggerFactory.getLogger(InventoryServiceImpl.class);

	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
		
	}
	
	
	@Override
	public InventoryResponse addInventory(InventoryRequest request) {
		
		log.info("Creating inventory ", request.getProductName() );
		
		Inventory inventory = new Inventory();
		
		inventory.setProductId(request.getProductId());
		inventory.setProductName(request.getProductName());
		inventory.setQuantity(request.getQuantity());
		
		log.debug("Saving inventory to database.");
		
		Inventory saveInventory = inventoryRepository.save(inventory);
		
		log.info("inventory saved to db", saveInventory.getId());
		
		//--------------------------------------------//
		
		InventoryResponse response = new InventoryResponse();
		
		response.setId(saveInventory.getId());
		response.setProductName(saveInventory.getProductName());
		response.setQuantity(saveInventory.getQuantity());
		
		log.info("response set", response.getId());
		
		log.debug("Inventory response prepared.", response.getId());
		
		return response;
	}

	
	@Override
	@Cacheable(value = "inventory", key = "'page:' + #page + ':size:' + #size")
	public List<InventoryResponse> getAllInventory(int page, int size) {
		
		Pageable pageable = PageRequest.of(page, size);
		
		
		Page<Inventory> result =  inventoryRepository.findAll(pageable);
		
		log.info("inventory ");
		
		List<InventoryResponse> response = new  ArrayList<InventoryResponse>();
		
		for(Inventory inventory : result) {
			
			InventoryResponse inventoryResponse = new InventoryResponse();
			
			inventoryResponse.setId(inventory.getId());
			inventoryResponse.setProductName(inventory.getProductName());
			inventoryResponse.setQuantity(inventory.getQuantity());
			
			response.add(inventoryResponse);
		}
		 
		return response;
		
		
	}
	
	

	@Override
	public boolean isStockAvailable(
	        Integer productId, int quantity) {

	    return inventoryRepository
	            .findByProductId(productId)
	            .map(inventory ->
	                    inventory.getQuantity() >= quantity)
	            .orElse(false);
	}

}
