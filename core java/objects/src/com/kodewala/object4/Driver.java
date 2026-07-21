package com.kodewala.object4;

class Product{
	{
		System.out.println("This is IIB...");
	}
	
}

public class Driver {
	static {
		System.out.println("This is SIB...");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is main...");
		
		Product product = new Product();
	}
}
