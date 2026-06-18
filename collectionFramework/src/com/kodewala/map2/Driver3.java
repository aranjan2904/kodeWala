package com.kodewala.map2;

import java.util.*;

public class Driver3 {
	public static void main(String[] args) {
		
			List<String> list = new ArrayList<String>();
			
			list.add("Abhishek");
			list.add("Vikash");
			list.add("Saurabh");
			list.add("Sumit");
			list.add("Rahul");
			
			System.out.println(list);
			
			Iterator<String> itr = list.iterator();
			
			while(itr.hasNext()) {
				 String element = itr.next();
				 if (element.startsWith("S")) {
					itr.remove();
					System.out.println("removing");
				}
				 
				 System.out.println(element);
			}
	}
}
