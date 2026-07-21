package com.kodewala.polymorphism;

class Upi extends Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment done using Upi");
	}
}
