package com.kodewala.inheritance2;

import java.awt.dnd.DropTargetAdapter;
import java.util.Set;

class PaymentProcess {
	private void connectToBank() {
		System.out.println("Connecting to bank");
	}
	
	void pay() {
		connectToBank();
	}

	void sendConfirmation() {
		System.out.println("Payment successful");
	}

	void sendFailedConfirmation() {
		System.out.println("Payment failed");
	}
}

class PhonePe extends PaymentProcess {
	private double amount;
	
	public PhonePe(double amount) {
		setAmount(amount);
	}
	

	public PhonePe() {
		// TODO Auto-generated constructor stub
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	void phonePePayment(double amount) {
		setAmount(amount);
		pay();
		//connectToBank();
		System.out.println("PhonePe payment of "+getAmount());
		sendConfirmation();
	}
}

class Gpay extends PaymentProcess {
private double amount;
	
	public Gpay(double amount) {
		setAmount(amount);
	}

	public Gpay() {
		// TODO Auto-generated constructor stub
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	void gpayPayment(double amount) {
		setAmount(amount);
		pay();
		//connectToBank();
		System.out.println("Gpay payment of "+getAmount());
		sendConfirmation();
	}
}

public class PaymentSystem {
	public static void main(String[] args) {

		PhonePe phonePe = new PhonePe();
		
		phonePe.phonePePayment(500);
		
		Gpay gpay = new Gpay();
		gpay.gpayPayment(1000);

		
	}
}