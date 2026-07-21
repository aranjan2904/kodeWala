package com.kodewala.abstract1;

class BlueDart extends DeliveryService {

	public BlueDart(String orderId) {
		super(orderId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void doDelivery() {
		System.out.println("Delivery via BlueDart for order: " + orderId);
		deliveryTimeEstimate();
	}

}
