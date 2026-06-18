package com.kodewala.map2;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver4 {
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Abhishek");
		list.add("Raju");
		list.add("Vikash");
		list.add("Rahul");
		
		for(String element : list) {
			
			if(element.startsWith("R")) {
				list.remove(element);
			}
		}
		
		System.out.println(list);
		
	}
}


