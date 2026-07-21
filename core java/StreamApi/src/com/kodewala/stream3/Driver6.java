package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver6 {
	public static void main(String[] args) {
		
		 List<Integer> input = Arrays.asList(1, 4,3,5,2,7,9,6,8);
		 
		 Optional<Integer> output =  input.stream().distinct().sorted((a,b) -> b-a).skip(1).findFirst();
		 
		 System.out.println(output.get());
	}
}
