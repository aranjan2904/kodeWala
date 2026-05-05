package com.kodewala.abstract1;

public class PNB extends RBI {

	public PNB(String accountHolder, double balance) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
	}

	void doKYC() {
		System.out.println("KYC on process...");
	}

	public double getInterestRate() {

		return 6.8;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("invalid amount");
			return;
		}
		balance = balance - amount;
	}

}
