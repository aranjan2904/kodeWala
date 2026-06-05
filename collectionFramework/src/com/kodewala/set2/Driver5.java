package com.kodewala.set2;

import java.util.HashSet;
import java.util.Objects;

class Product1 {
	int id;
	String name;
	
	public Product1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product1 p = (Product1) obj;
		return this.id == p.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
	
}

public class Driver5 {
	public static void main(String[] args) {
		
		HashSet<Product1> set = new HashSet<Product1>();
		
		set.add(new Product1(101, "Mobile"));
		set.add(new Product1(102, "Laptop"));
		set.add(new Product1(103, "Mobile"));
		
		System.out.println(set);
		
	}
	
}
