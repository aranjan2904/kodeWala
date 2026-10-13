package com.ownly.inventory.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log =
            LoggerFactory.getLogger(InventroryController.class);

    public InventroryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public InventoryResponse addInventory(
            @RequestBody InventoryRequest request) {

        log.info("POST inventory - Adding inventory.",
                request.getProductName());

        InventoryResponse response = inventoryService.addInventory(request);

        log.info("POST inventory - Inventory added successfully.",response.getId());

        return response;
    }

    @GetMapping
    public List<InventoryResponse> getAllInventory(
            @RequestParam int page,
            @RequestParam int size) {

        log.info("GET Fetching inventory.",
                page, size);

        List<InventoryResponse> response =
                inventoryService.getAllInventory(page, size);

        log.info("GET Inventory fetched.",
                response.size());

        return response;
    }
}