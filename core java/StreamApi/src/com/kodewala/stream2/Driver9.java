package com.kodewala.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Rahul", "vikash","Abhishek");
		
		List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sortedNames);
	}
}
