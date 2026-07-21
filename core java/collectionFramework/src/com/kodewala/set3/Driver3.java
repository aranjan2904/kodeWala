package com.kodewala.set3;

import java.util.TreeSet;

public class Driver3 {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Raju");
		set.add("Rohan");
		set.add("Bhanu");
		set.add("Raju");
		set.add("Shailesh");
		set.add("Ranka");
		//set.add(null);
		
		System.out.println(set);
	}
}
