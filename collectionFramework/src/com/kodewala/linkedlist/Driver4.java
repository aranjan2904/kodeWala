package com.kodewala.linkedlist;

import java.util.LinkedList;

public class Driver4 {
	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		
		numbers.add(3, 50);
		System.out.println(numbers);
		
		numbers.addFirst(5);
		numbers.addLast(90);
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(5));
		System.out.println(numbers.getLast());
		
		numbers.set(1, 66);
		System.out.println(numbers);
		
		numbers.remove(Integer.valueOf(66));
		System.out.println(numbers);
		
		numbers.remove(5);
		System.out.println(numbers);
		
		System.out.println(numbers.contains(50));
		
		for(Integer n : numbers) {
			System.out.print(n);
		}
		
		
		
	}
}
