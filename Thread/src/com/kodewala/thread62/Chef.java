package com.kodewala.thread62;

public class Chef extends Thread{
	
	private Restaurant restaurant;
	
	public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
	
	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			
			restaurant.prepareOrder();
		}
	}
}
