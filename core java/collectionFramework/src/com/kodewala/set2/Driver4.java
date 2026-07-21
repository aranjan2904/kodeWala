package com.kodewala.set2;

import java.util.HashSet;

public class Driver4 {
	public static void main(String[] args) {
		
		HashSet<Integer> studentIds = new HashSet<Integer>(64);
		
		studentIds.add(101);
		studentIds.add(102);
		studentIds.add(103);
		studentIds.add(104); 
		studentIds.add(105); 
		studentIds.add(106); 
		studentIds.add(107); 
		studentIds.add(108); 
		studentIds.add(109); 
		studentIds.add(110); 
		studentIds.add(111); 
		studentIds.add(112); 
		
		
		System.out.println(studentIds);
		
		studentIds.add(113); 
		
		studentIds.remove(101);
		studentIds.remove(102);
		
		System.out.println(studentIds);
	}
}
