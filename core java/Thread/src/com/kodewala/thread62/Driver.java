package com.kodewala.thread62;

public class Driver {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		Customer customer = new Customer(restaurant);
		Chef chef = new Chef(restaurant);

		customer.start();
		chef.start();
	}
}
