package com.kodewala.polymorphism;

public class Gpay extends Payment {
	@Override
	public void doPayment() {
		System.out.println("payment done using Gpay");
	}
}
