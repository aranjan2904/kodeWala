package com.ownly.inventory.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ownly.inventory.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
	
	List<Inventory> findByProductName(String productName);
	
	Optional<Inventory> findByProductId(Integer productId);

}
