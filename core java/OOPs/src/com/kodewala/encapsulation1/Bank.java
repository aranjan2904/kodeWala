package com.kodewala.encapsulation1;

public class Bank {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(500);
		System.out.println(account.getBalance());
	}
}
