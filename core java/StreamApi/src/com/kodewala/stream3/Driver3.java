package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,4,6,8,3,45,9,4);
		
	    List<Integer> outpur =	input.stream().skip(2).collect(Collectors.toList());
	    
	    System.out.println(outpur);
	}
}
