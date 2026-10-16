package com.shopflow.productservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    @GetMapping("/inventory/check")
    boolean checkStock(
            @RequestParam("productName")
            String productName,

            @RequestParam("quantity")
            int quantity
    );
}