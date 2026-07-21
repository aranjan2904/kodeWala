package com.kodewala.exception4;

public class FoodDelivery {
	int walletBalance = 500;
	
	public void orderFood(int amount) {
		try {
			if(amount > walletBalance) {
				throw new WalletBalanceInsufficientException("insufficient Balance");
			}
			
			walletBalance = walletBalance - amount;
			
			System.out.println("food order placed");
		}
		catch(WalletBalanceInsufficientException e) {
			e.printStackTrace();
		}
	}
}
