package com.ownly.inventory.dto;

public class InventoryRequest {

	private String productName;
	private Integer quantity;

	public InventoryRequest() {

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
