package com.ownly.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ownly.inventory.dto.InventoryRequest;
import com.ownly.inventory.dto.InventoryResponse;
import com.ownly.inventory.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventroryController {
	
	private final InventoryService inventoryService;

	public InventroryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}

	@PostMapping
	public InventoryResponse addInventory(@RequestBody InventoryRequest request) {
		
		return inventoryService.addInventory(request);
	}
	
	 @GetMapping
	    public List<InventoryResponse> getAllInventory(@RequestParam int page, @RequestParam int size) {

	        return inventoryService.getAllInventory(page,size);
	    }
	
}
