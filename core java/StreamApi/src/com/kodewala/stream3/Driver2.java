package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class Driver2 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,5,7,9,3,4,6);
		
		//Ascending order
		input.stream().sorted().forEach(number -> System.out.print(number + " "));
		
		System.out.println();
		
		//Descending order
		input.stream().sorted((a,b) -> b-a).forEach(number -> System.out.print(number + " "));
	}
}
