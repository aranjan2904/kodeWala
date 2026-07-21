package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(3,2,8,5,49,3,5,1,6,7,3,54,21,6,20,13);
		
		 Optional<Integer> output = input.stream().filter(e -> e%2 ==0).distinct().sorted((a,b) -> b-a).skip(2).findFirst();
		 
		 System.out.println(output.get());
	}

}
