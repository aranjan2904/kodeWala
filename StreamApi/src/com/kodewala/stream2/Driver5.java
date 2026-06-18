package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("amit", "rahul", "vijay");
		
		List<String> uppercase = name.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(uppercase);
	}
}
