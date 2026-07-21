package com.kodewala.exception5;

public class Driver2 {
	public static void main(String[] args) {

		Order order = new Order();

		try {
			order.placeOrder();
		} 
		catch (FailedToPlaceOrderException e) {
			e.printStackTrace();
			System.out.println("unable to place order");
		}

	}
}

class Order {
	public void placeOrder() throws FailedToPlaceOrderException {

		Payment payment = new Payment();
		try {
			payment.doPayment();
		} catch (PaymentFailedException e) {
			e.printStackTrace();
			System.out.println("unable to do payment");
		}

	}
}

class Payment {
	public void doPayment() throws PaymentFailedException {

		if (true) {
			throw new PaymentFailedException("payment failed");
		}
	}
}
