package com.kodewala.exception1;

public class Payment {
	int balance;
	int sendMoney;
	
	
	public Payment(int balance, int sendMoney) {
		super();
		this.balance = balance;
		this.sendMoney = sendMoney;
	}


	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getSendMoney() {
		return sendMoney;
	}



	public void setSendMoney(int sendMoney) {
		this.sendMoney = sendMoney;
	}
	
	void doPayment() {
		
		try {
			if(getSendMoney() > getBalance()) {
				
			}
			int avlBalance = getBalance() - getSendMoney();
		}
		catch(Exception e) {
			
		}
	}



	public static void main(String[] args) {
		
		Payment payment = new Payment(500, 1000);
		payment.doPayment();
		
	}

}
