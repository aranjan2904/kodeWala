package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver5 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(2,4,223,767,323,85,124,68,363,56225,235235,4,6,32,76,34,90);
		
		Optional<Integer> output = input.stream().distinct().sorted((a,b) -> b -a).skip(1).findFirst();
		
		System.out.println(output.get());
		
		 Optional<Integer> max = input.stream().distinct().max((a,b) -> a-b);
		 
		 System.out.println(max.get());
		
	}
}
