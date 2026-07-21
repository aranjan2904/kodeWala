package com.kodewala.abstract1;

public abstract class RBI {
	String accountHolder;
	double balance;
	
	public RBI(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	abstract void doKYC();
	
	void updateAddress() {
		System.out.println("Address updated");
	}

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposited: "+ amount);
	}
	
	void checkBalance() {
	    System.out.println("Balance: " + balance);
	}
	
	abstract double getInterestRate();
	
	abstract void withdraw(double amout);
}
