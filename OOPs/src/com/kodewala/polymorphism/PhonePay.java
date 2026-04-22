package com.kodewala.polymorphism;

class PhonePay extends Payment {
	@Override
	public void doPayment() {
		System.out.println("payment done using phonePay");
	}
}
