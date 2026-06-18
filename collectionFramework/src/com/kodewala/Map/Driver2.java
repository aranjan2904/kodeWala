package com.kodewala.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver2 {
	public static void main(String[] args) {
		
		Map<String, String> studentMap = new HashMap<String, String>();
	
		
		studentMap.put("2", "Saurabh");
		studentMap.put("5", "vivek");
		studentMap.put("6", "Shailesh");
		studentMap.put("7", "Rahul");
		
		System.out.println(studentMap);
		
		
		//Iterating in map
		
	 	Set<Entry<String, String>> entrySet = studentMap.entrySet();
	 	
	 	Iterator<Entry<String,String>> itr = entrySet.iterator();
	 	
	 	while(itr.hasNext()) {
	 		
	 		Entry<String,String> entry = itr.next();
	 		System.out.println(entry.getKey());
	 	}
	 	
	}
}
