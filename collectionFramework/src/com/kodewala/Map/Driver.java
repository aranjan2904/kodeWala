package com.kodewala.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
	
		
		studentMap.put(2, "Abhishek");
		studentMap.put(1, "Raju");
		studentMap.put(5, "Shailesh");
		studentMap.put(4, "Vikash");
		
		System.out.println(studentMap);
		
		
		//Iterating in map
		
		Set<Entry<Integer,String>> entrySet = studentMap.entrySet(); //Map don't have iterator so converting map to set
		
		 Iterator<Entry<Integer,String>> itr = entrySet.iterator();  //using iterator on set
		 
		 while(itr.hasNext()) {
			 Entry<Integer,String> entry = itr.next();
			 System.out.println("Roll " + entry.getKey() + " name " + entry.getValue());
		 }
	}
}
