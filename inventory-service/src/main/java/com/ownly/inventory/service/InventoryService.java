package com.ownly.inventory.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ownly.inventory.dto.InventoryRequest;
import com.ownly.inventory.dto.InventoryResponse;

public interface InventoryService {
	
	InventoryResponse addInventory(InventoryRequest request);
	
	List<InventoryResponse> getAllInventory(int page, int size);

}
