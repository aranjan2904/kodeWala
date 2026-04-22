package com.kodewala.inheritance2;

class DeliveryService {
	public void connectToResturant() {
		System.out.println("connecting to resturant");
	}

	public void processOrder() {
		System.out.println("order processing");
	}

	public void sendConfirmation(int amount) {
		System.out.println("sms sent"+ amount);
	}
}

class Zomato extends DeliveryService {
	public void zomatoOrder(int amount) {
		connectToResturant();
		processOrder();
		sendConfirmation(amount);
	}
}

class Swiggy extends DeliveryService {
	public void zomatoOrder() {
		connectToResturant();
		processOrder();
		sendConfirmation(1000);
	}
}

public class FoodDeliverySystem {
	public static void main(String[] args) {
		Zomato zomato = new Zomato();
		zomato.zomatoOrder(200);
	}
}
