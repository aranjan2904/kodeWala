package com.kodewala.polymorphism;

public class Zomato extends Order {
	@Override
	public void processOrder() {
		System.out.println("order processed by zomato");
	}
}
