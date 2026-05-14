package com.kodewala.collection1;

import java.util.ArrayList;

public class RestaurantMenu {
	public static void main(String[] args) {
		
		ArrayList<String> menuList = new ArrayList<String>();
		
		menuList.add("Paneer Butter Masala");
		menuList.add("Chicken Biryani");
		menuList.add("Burger");
		menuList.add("Pizza");
		menuList.add("Momos");
		menuList.add("Cold Coffee");
		menuList.add("Fried Rice");
		menuList.add("Pasta");
		menuList.add("Chicken Roll");
		menuList.add("Ice Cream");
		
		System.out.println("Restaurant Menu");
		System.out.println(menuList);
		
		System.out.println("----------");
		
		System.out.println("Total item: " + menuList.size());
		
		System.out.println("-----------");
		
		System.out.println("first item: " + menuList.get(0));
		System.out.println("last item: " + menuList.get(menuList.size() -1));
		
		System.out.println("---------");
		
		menuList.set(2, "veg burger");
		System.out.println(menuList);
	}
}
