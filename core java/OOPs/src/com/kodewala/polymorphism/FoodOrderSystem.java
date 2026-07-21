package com.kodewala.polymorphism;

public class FoodOrderSystem {
	public static void main(String[] args) {
		OrderProcess orderProcess = new OrderProcess();
		
		Order zomato = new Zomato();
		Order swiggy = new Swiggy();
		orderProcess.processOrder1(swiggy);
		
	}
}
