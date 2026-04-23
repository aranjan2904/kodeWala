package com.kodewala.Polymorphism2;

public class Payment {
	public void doPayment() {
		
		connectToBank();
	    validatingPayment();
	    sendMessage();
		
	}
	
	private void connectToBank() {
		System.out.println("connecting to bank server");
	}
	
	private void  validatingPayment() {
		System.out.println("payment failed or sucess");
	}
	
	private void sendMessage() {
		System.out.println("message sent");
	}
	
}
