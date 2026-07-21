package com.kodewala.product;

public class Product {
	
	private  int id;
	private String name;
	private String description;
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void showProduct() {
		System.out.println("showing product");
		System.out.println(id);
		System.out.println(name);
		System.out.println(description);
	}
	
}
