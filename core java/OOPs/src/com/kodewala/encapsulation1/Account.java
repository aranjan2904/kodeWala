package com.kodewala.encapsulation1;

public class Account {
	
	private double balance=1000;
	
	//setter
	public void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		}else {
			System.out.println("invalid amount");
		}
	}
	
	//getter
	public double getBalance() {
		return balance;
	}
}

