package com.kodewala.abstract1;

public class SBI extends RBI {

	public SBI(String accountHolder, double balance) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
	}

	void doKYC() {
		System.out.println("KYC on process...");
		updateAddress();
	}

	public double getInterestRate() {

		return 6.5;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("invalid amount");
			return;
		}
		balance = balance - amount;
	}
}
