package com.kodewala.set3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Laptop");
		set.add("Mobile");
		set.add("Computer");
		set.add("Mouse");
		set.add("Bag");
		set.add("Keyboard");
		
		//Looping through for each method
		for(String product : set) {
			if(product.startsWith("M")) {
				System.out.println(product);
			}
		}
		
		//Looping through Iterator.              Iterator is method of iterable interface which is on top of collection framework      
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String product = itr.next();
			if(product.startsWith("M")) {
				System.out.println(product);
			}
		}
	}
}
