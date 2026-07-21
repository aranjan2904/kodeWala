package com.kodewala.set4;

import java.util.TreeSet;

public class Driver2 {
	public static void main(String[] args) {
		
		Product p1 = new Product("Laptop", 40000);
		Product p2 = new Product("Mouse" , 45000);
		
		TreeSet<Product> productSet = new TreeSet<Product>(new ProductComparator());
		
		productSet.add(p1);
		productSet.add(p2);
		
		for(Product p : productSet) {
			System.out.println(p.price);
			System.out.println(p.name);
		}
	}
}
