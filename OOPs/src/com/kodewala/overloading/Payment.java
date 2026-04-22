package com.kodewala.overloading;

class PaymentWay {
	public void paymentProcess(String phonePayNo) {
		System.out.println("Connecting to PhonePay server");
	}
	
	public void paymentProcess(String creditCardNumber, int expiryDate) {
		System.out.println("Connecting to CreditCard server");
	}
	
	public void paymentProcess(String InternetBankingId, String Password) {
		System.out.println("Connecting to Bank server");
	}
}

public class Payment {
	public static void main(String[] args) {
		PaymentWay paymentWay = new PaymentWay();
		paymentWay.paymentProcess("5321456214");
		paymentWay.paymentProcess("2654-6541-6816", 2026);
		paymentWay.paymentProcess("aranjan5695", "dfa54165");
	}
}
