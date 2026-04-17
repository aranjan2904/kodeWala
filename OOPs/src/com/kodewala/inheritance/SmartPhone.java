package com.kodewala.inheritance;

class Product {
	private String ProductName;
	private double price;

	public Product(String productName, double price) {
		setProductName(productName);
		setPrice(price);
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative or zero");
		}
		this.price = price;
	}

}

class Mobile extends Product {
	private String ramSize;

	public Mobile(String productName, double price, String ramSize) {
		super(productName, price);
		setRamSize(ramSize);
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

}

public class SmartPhone {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Red me", 17000, "4 GB");
	}
}
