package com.ownly.inventory.service;

import java.util.ArrayList;
import java.util.List;

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
	
	

	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
		
	}
	
	

	@Override
	public InventoryResponse addInventory(InventoryRequest request) {
		
		Inventory inventory = new Inventory();
		
		inventory.setProductName(request.getProductName());
		inventory.setQuantity(request.getQuantity());
		
		Inventory saveInventory = inventoryRepository.save(inventory);
		
		//--------------------------------------------//
		
		InventoryResponse response = new InventoryResponse();
		
		response.setId(saveInventory.getId());
		response.setProductName(saveInventory.getProductName());
		response.setQuantity(saveInventory.getQuantity());
		
		return response;
	}

	
	@Override
	public List<InventoryResponse> getAllInventory(int page, int size) {
		
		Pageable pageable = PageRequest.of(page, size);
		
		
		Page<Inventory> result =  inventoryRepository.findAll(pageable);
		
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

}
