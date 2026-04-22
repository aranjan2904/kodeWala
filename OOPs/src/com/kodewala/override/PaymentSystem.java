package com.kodewala.override;

class Payment {
	void paymentProcess() {
		System.out.println("Doing payment...");
	}
}

class PhonePay extends Payment {
	void paymentProcess() {
		System.out.println("Doing payment... via phone pay...");
	}
}

class Gpay extends Payment {
	void paymentProcess() {
		System.out.println("Doing payment... via Gpay..");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		
		PhonePay phonePay = new PhonePay();
		phonePay.paymentProcess();
		
		Gpay gPay = new Gpay();
		gPay.paymentProcess();
	}
}
