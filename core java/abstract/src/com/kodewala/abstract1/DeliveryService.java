package com.kodewala.abstract1;

abstract class DeliveryService {
	String orderId;

	public DeliveryService(String orderId) {
		this.orderId = orderId;
	}

	abstract void doDelivery();

	void deliveryTimeEstimate() {
		System.out.println("Estimating delivery time");
	}

}
