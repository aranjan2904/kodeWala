package com.kodewala.inheritance;

class Vehicle {
	private String brand;
	private double price;

	public Vehicle(String brand, double price) {
		setBrand(brand);
		setPrice(price);
	}

	public void setBrand(String brand) {
		if (brand == null || brand.trim().isEmpty()) {
			throw new IllegalArgumentException("Brand name cannot be empty");
		}
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("price cannot be empty");
		}
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}

class Car extends Vehicle {
	private String model;

	public Car(String brand, double price, String model) {
		super(brand, price);
		setModel(model);
	}


	public void setModel(String model) {
		if (model == null || model.trim().isEmpty()) {
			throw new IllegalArgumentException("Model name cannot be empty");
		}this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
}

public class VehicleSystem {
	public static void main(String[] args) {
		Car car = new Car("Toyota", 1500000, "kjhasf");
		System.out.println(car.getBrand());
		System.out.println(car.getPrice());
		System.out.println(car.getModel());
	}
}
