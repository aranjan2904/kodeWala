package com.kodewala.exception4;

import java.io.IOException;

public class Bank {
	int balance = 5000;

	public void serverConnection() throws IOException {
		throw new IOException("Bank server not responding");
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}

		balance = balance - amount;

		System.out.println("withdraw successful");
		System.out.println("Remaining balance" + balance);
	}

}
