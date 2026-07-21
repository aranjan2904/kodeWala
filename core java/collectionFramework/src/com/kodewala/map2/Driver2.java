package com.kodewala.map2;

import java.util.*;

public class Driver2 {
	public static void main(String[] args) {
		
			List<String> list = new ArrayList<String>();
			
			list.add("Abhishek");
			list.add("Vikash");
			list.add("Saurabh");
			list.add("Sumit");
			list.add("Rahul");
			
			System.out.println(list);
			
			for(String name : list) {
				list.remove(name);
			}
	}
}
