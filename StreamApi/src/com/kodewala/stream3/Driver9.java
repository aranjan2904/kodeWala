package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver9 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(3,5,8,2,9,4,6);
		
		Optional<Integer> output = input.stream().distinct().sorted((a,b) -> b -a).findFirst();
		
		System.out.println(output.get());
	}
}
