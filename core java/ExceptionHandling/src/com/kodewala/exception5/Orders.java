package com.kodewala.exception5;

public class Orders {

	int orderId;
	String customerName;
	int amount;

	public Orders(int orderId,
			String customerName,
			int amount) {

		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}

	public void display() {

		System.out.println(orderId
				+ " "
				+ customerName
				+ " "
				+ amount);
	}
}