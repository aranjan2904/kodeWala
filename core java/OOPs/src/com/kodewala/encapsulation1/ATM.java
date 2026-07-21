package com.kodewala.encapsulation1;



public class ATM {
	private double balance;
	private String pin;
	
	
	public ATM(double balance, String pin) {
		super();
		this.balance = balance;
		this.pin = pin;
	}

	public void deposit(double _amount, String _enteredPin) {
		if (_enteredPin.equals(pin)) {
			balance = balance + _amount;
			System.out.println(balance);
		}
	}
	public void widthdraw(double _amount, String _enteredPin) {
		if (_enteredPin.equals(pin) && balance > _amount) {
			balance = balance - _amount;
			System.out.println(balance);
		}
	}
	

	public static void main(String[] args) {
		ATM atm = new ATM(2000,"1234");
		atm.deposit(1000,"1234");
		atm.widthdraw(500, "1234");
	}
}
