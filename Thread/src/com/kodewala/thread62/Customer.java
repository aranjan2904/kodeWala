package com.kodewala.thread62;

public class Customer extends Thread{
	private Restaurant restaurant;
	
	public Customer(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		
		String[] orders = {
				
				"Burger",
				"Pizza",
				"pasta",
				"Coffee",
				"sandwich"
		};
		
		for (String order : orders) {
			restaurant.placeOrder(order);
		}
	}
}
