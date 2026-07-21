package com.kodewala.Map;


import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		this.name = name;
		this.roll = roll;
	}
	
	
}

public class Driver3 {
	public static void main(String[] args) {
		
		
		
		Map<Integer,String> map = new HashMap<>();
		
		Set<Entry<Integer,String>> entrySet =  map.entrySet();
		
		Iterator<Entry<Integer,String>> itr =  entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
