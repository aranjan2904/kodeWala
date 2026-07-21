package com.kodewala.abstract1;

public class Ekart extends DeliveryService {

	public Ekart(String orderId) {
		super(orderId);
	}

	@Override
	void doDelivery() {
		System.out.println(" Delivery via Ekart for order:" + orderId);
		deliveryTimeEstimate();
	}
}

