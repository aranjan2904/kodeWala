package com.kodewala.polymorphism;

public class PaymentSystem {

	public static void main(String[] args) {
		
		PaymentProcess process = new PaymentProcess();
		
		Payment p1 = new Upi();
		Payment p2 = new Gpay();
		
		process.processPayment(p1);
		process.processPayment(p2);
		

	}

}
