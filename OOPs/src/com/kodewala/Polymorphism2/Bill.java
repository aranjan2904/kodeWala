package com.kodewala.Polymorphism2;

public class Bill {
	
	public boolean generateBill() {
		
		generateBillNumber();
		
		checkPayment();
	
		return true;
	}
	
	private void generateBillNumber(){
		System.out.println("generating bill number");
	}
	
	private void checkPayment() {
		System.out.println("payment done or failed");
	}
	
	
}
