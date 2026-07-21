package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,2,4,3,5,2,6,8,4,6,9,3,1,5);
		
		List<Integer> output =  input.stream().distinct().collect(Collectors.toList());
		
	   //input.stream().distinct().forEach(i -> System.out.println(i));
		
		//input.stream().distinct().forEach(System.out :: println);
		
		
		System.out.print(output);
	}
}