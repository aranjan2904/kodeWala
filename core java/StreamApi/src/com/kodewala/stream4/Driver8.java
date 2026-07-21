package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver8 {
	public static void main(String[] args) {
		
		List<Integer> numbers1 = Arrays.asList(1,5,3,7,9,5,3,8,0,3);
		List<Integer> numbers2 = Arrays.asList(3,6,23,81,19,0,52,2);
		
		Stream.concat(numbers1.stream(), numbers2.stream()).distinct()
															.filter(e -> e%2 == 0)
															.sorted((a,b) -> a-b)
															.forEach(w -> System.out.print(w+ " "));
		
	
	}
}