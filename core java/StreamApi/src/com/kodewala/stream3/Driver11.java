package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver11 {
	public static void main(String[] args) {
		
		List<String> input = Arrays.asList("Rahul", "Amit", "Abhishek", "Piyush");
		
		Map<Integer,List<String>> output = input.stream().collect(Collectors.groupingBy(m -> m.length()));
		
		System.out.println(output);
	}
}
