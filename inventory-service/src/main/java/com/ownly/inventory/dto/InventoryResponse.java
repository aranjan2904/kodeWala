package com.ownly.inventory.dto;

public class InventoryResponse {

	private Long id;
	private String productName;
	private Integer quantity;

	public InventoryResponse() {
	}

	public InventoryResponse(Long id, String productName, Integer quantity) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getQuantity() {
		return quantity;
	}
}