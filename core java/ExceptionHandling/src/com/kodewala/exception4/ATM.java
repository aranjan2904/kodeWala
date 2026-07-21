package com.kodewala.exception4;

public class ATM {
	int balance = 5000;
	
	public void withdraw(int amount) {
		
		try {
			if(amount > balance) {
				throw new InsufficientBalanceLeftException("insufficient balance");
			}
		}
		catch(InsufficientBalanceLeftException e) {
			e.printStackTrace();
		}
		
		balance = balance - amount;
	}
}
