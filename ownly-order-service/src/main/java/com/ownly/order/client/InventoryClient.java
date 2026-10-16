package com.ownly.order.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ownly.order.response.InventoryResponse;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    @GetMapping("/inventory")
    List<InventoryResponse> getAllInventory();

    @GetMapping("/inventory/check")
    boolean checkStock(
            @RequestParam("productId") Integer productId,
            @RequestParam("quantity") int quantity);
}