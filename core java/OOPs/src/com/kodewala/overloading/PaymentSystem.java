package com.kodewala.overloading;

class Patient {
	void payment() {
		System.out.println("payment done by  patient");
	}
}

class NewPatient extends Patient {
	void newPayment() {
		System.out.println("payment done by new patient");
	}
}

class NewChildPatient extends NewPatient  {
	void newPayment() {
		System.out.println("payment done by newChild patient");
	}
}
public class PaymentSystem {
	public static void main(String[] args) {
		
	}
}
