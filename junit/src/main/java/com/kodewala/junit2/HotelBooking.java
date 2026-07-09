package com.kodewala.junit2;

public class HotelBooking {
	public double calculateBill(int nights, double roomPrice, boolean breakfast, boolean swimmingPool) {
		
		double total = nights * roomPrice;
		
		if(breakfast) {
			total = total + nights * 500;
		}
		
		if(swimmingPool) {
			total = total + nights * 300;
		}
		
		return total;
	}
}
