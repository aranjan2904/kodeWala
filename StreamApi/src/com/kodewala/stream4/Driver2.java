package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;

public class Driver2 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,6,3,5,8,9,4,3);
		
		int output = input.stream().filter(n -> n%2 != 0).reduce(0, (a,b) -> a+b);
		
		System.out.println(output);
	}
}
