package com.kodewala.set2;

import java.util.HashSet;
import java.util.Set;

public class Driver2 {
	public static void main(String[] args) {
		
		Set<String> products = new HashSet<String>();
		
		products.add("One");
		products.add("Two");
		products.add("Three");
		products.add("Four");
		products.add("Five");
		products.add("Six");
		products.add("Seven");
		products.add("Eight");
		products.add("Nine");
		products.add("Ten");
		products.add("Eleven");
		products.add("Twelve");
		
		//by default load factor is 0.75 so threshold is 12 means after 12 element it will increase the capacity to double
		//after capacity increase it will trigger rehashing and calculate new index based on new capacity and shift the element.
		
		System.out.println(products);
		
		products.add("Thirteen");
		
		
		System.out.println(products);
	}
}
