package com.flipkart.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    // Change this mapping to match the endpoint exposed by your existing Inventory Service.
    @GetMapping("/api/inventory/{productId}")
    InventoryResponse getInventory(@PathVariable("productId") Long productId);

    record InventoryResponse(Long productId, Integer availableQuantity) {
    }
}
