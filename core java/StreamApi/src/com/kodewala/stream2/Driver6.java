package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver6 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amit", "Rahul", "Ankit", "Vijay", "Ajay");
		
		List<String> nameList = names.stream().filter(l -> l.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(nameList);
	}
}
