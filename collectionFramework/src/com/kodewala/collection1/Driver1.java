package com.kodewala.collection1;

import java.util.ArrayList;

public class Driver1 {
	public static void main(String[] args) {

		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

		Restaurant r1 = new Restaurant("Dominos", "Delhi", 4);
		Restaurant r2 = new Restaurant("KFC", "Mumbai", 5);
		Restaurant r3 = new Restaurant("Burger King", "Bangalore", 3);
		Restaurant r4 = new Restaurant("Pizza Hut", "Hyderabad", 4);
		Restaurant r5 = new Restaurant("Barbeque Nation", "Chennai", 5);
		Restaurant r6 = new Restaurant("Subway", "Pune", 3);
		Restaurant r7 = new Restaurant("McDonalds", "Kolkata", 4);
		Restaurant r8 = new Restaurant("Biryani House", "Lucknow", 5);
		Restaurant r9 = new Restaurant("Food Plaza", "Patna", 2);
		Restaurant r10 = new Restaurant("Cafe Coffee Day", "Jaipur", 4);

		restaurantList.add(r1);
		restaurantList.add(r2);
		restaurantList.add(r3);
		restaurantList.add(r4);
		restaurantList.add(r5);
		restaurantList.add(r6);
		restaurantList.add(r7);
		restaurantList.add(r8);
		restaurantList.add(r9);
		restaurantList.add(r10);

		
//		int count = 0;
//		for (int i = 0; i < restaurantList.size(); i++) {
//
//			Restaurant currentRestaurant = restaurantList.get(i);
//
//			if (currentRestaurant.getRating() >= 4) {
//
//				System.out.println(currentRestaurant.getName());
//			}
//			
//			if(currentRestaurant.getRating() < 3) {
//				count = count +1;
//			}
//			
//			while(currentRestaurant.getLocation().equals("Mumbai")) {
//				System.out.println(currentRestaurant.getName());
//				break;
//			}
//		}
//		System.out.println("-------------");
//		System.out.println("Restaurant with rating less than 3 are: " + count);
		
		
		for (int i = restaurantList.size() -1; i >= 0; i--) {
			Restaurant currenRestaurant = restaurantList.get(i);
			System.out.println("-----------------");
			System.out.println("Restaurant Name: "+currenRestaurant.getName());
			System.out.println("Restaurant Location: "+currenRestaurant.getLocation());
			System.out.println("Restaurant Rating: "+currenRestaurant.getRating());
		}
	}
}