package com.kodewala.set3;

import java.util.TreeSet;

class Product {
	String name;
	
	public Product(String name) {
		this.name = name;
	}
	
	
}

public class Driver4 {

	public static void main(String[] args) {
		
		Product product1 = new Product("Laptop");
		Product product2 = new Product("Table");
		Product product3 = new Product("Mouse");
		Product product4 = new Product("Keyboard");
		
		TreeSet<Product> productSet = new TreeSet<Product>();
		
		productSet.add(product1);
		productSet.add(product2);
		productSet.add(product3);
		productSet.add(product4);
		
		System.out.println(productSet);
		
		
	}

}
