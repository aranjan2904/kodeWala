package com.kodewala.practice.objects;

class SavingAccount {
	double intrestRate;
	
	public SavingAccount(double _intrestRate) {
		this.intrestRate = _intrestRate;
	}
}

class Account extends SavingAccount{
	String accountHolder;
	double balance;
	
	public Account(double _intrestRate, String _accountHolder) {
		this(_accountHolder,_intrestRate,1000);
	}
	
	public Account(String _accountHolder, double _intrestRate, double _balance) {
		super(_intrestRate);
		this.accountHolder = _accountHolder;
		this.intrestRate = _intrestRate;
		this.balance = _balance;
	}
	
	double calculateIntrest(){
		double intrestAmount = (balance*intrestRate*1)/100;
		double totalBalance = intrestAmount + balance;
		return totalBalance;
	}
	void display() {
		System.out.println(accountHolder);
		System.out.println(calculateIntrest());
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		Account account = new Account(3.5, "Abhishek Ranjan");
		account.display();
	}
}
