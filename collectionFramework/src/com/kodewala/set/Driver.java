package com.kodewala.set;

import java.util.HashSet;
import java.util.Set;

 

public class Driver {
	public static void main(String[] args) {
		
		Set<String> city = new HashSet<>();
		
		city.add("Daltonganj");
		city.add("Ranchi");
		city.add("mumbai");
		city.add("garhwa");
		
		System.out.println("Daltonganj".hashCode());
		System.out.println("mumbai".hashCode());
		System.out.println("Ranchi".hashCode());
		
		
		int hash = "Ranchi".hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = (16 -1) & hash;
		System.out.println("Ranchi stored at: " + bucketIndex);
		
		
	}
}
