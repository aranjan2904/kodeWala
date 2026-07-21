package com.kodewala.Polymorphism2;

class OrderFood{
	void order(String itemName, int quantity, String chefNote) {
		System.out.println("order with itemName, quantity and chefNote");
	}
	
	void order(String itemName, int quantity) {
		System.out.println("order with itemName, quantity");
	}
}

public class FoodOrderSystem {
	public static void main(String[] args) {
		OrderFood orderFood = new OrderFood();
		
		orderFood.order("biryani", 1, "put lots of masala on it");
	}
}
