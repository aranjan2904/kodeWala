package com.kodewala.stream4;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {
		String name = "Abhishek";
		
		Map<Character, Long> output = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		
		System.out.println(output);
	}
}
