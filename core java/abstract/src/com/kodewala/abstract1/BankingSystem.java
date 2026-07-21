package com.kodewala.abstract1;

public class BankingSystem {
	public static void main(String[] args) {
		
		RBI bank = new SBI("Abhishek", 500000);
		bank.doKYC();
		bank.deposit(4000);
		bank.checkBalance();
		bank.withdraw(6000);
		bank.checkBalance();
		System.out.println("----------------");
		
		
		RBI bank1 = new PNB("vikash", 100000);
		bank1.doKYC();
		bank1.checkBalance();
		bank1.deposit(50000);
		bank1.checkBalance();
		bank1.withdraw(30000);
		bank1.checkBalance();
	}

}
