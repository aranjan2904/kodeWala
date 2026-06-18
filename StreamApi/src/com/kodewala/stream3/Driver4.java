package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver4 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,6,3,5,8,9,4,3);
		
		Optional<Integer> optional = input.stream().findFirst();
		
		System.out.println(optional.get());
		
		Optional<Integer> output = input.stream().findAny();
		System.out.println(output.get());
			
	}
}
