package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver3 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(6,3,5,8,9,4,3);
		
		
	//	Optional<Integer> output =  input.stream().distinct().sorted((a,b) -> a-b).findFirst();
	//	System.out.println(output.get());
		
		
	//	Optional<Integer> output =  input.stream().max((a,b) -> a-b);
		
	//	System.out.println(output.get());
		
		Optional<Integer> output2 =  input.stream().min((a,b) -> a-b);
		System.out.println(output2.get());
		
		
		
		
	}
}
