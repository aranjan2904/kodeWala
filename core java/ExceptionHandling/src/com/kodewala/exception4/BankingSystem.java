package com.kodewala.exception4;

import java.io.IOException;

public class BankingSystem {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		try {
			bank.withdraw(5000);
			
			bank.serverConnection();
		}
		catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Bank connection close");
		}
	}
}
