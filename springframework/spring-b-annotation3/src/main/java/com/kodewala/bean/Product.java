package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Value("567")
	private long productId;
	
	@Value("ranjan")
	private String name;
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}



	public void display() {
		System.out.println("this is product bean");
	}
}
