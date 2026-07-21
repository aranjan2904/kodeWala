package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class Driver10 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(3,6,3,8,0,9,4,3,1);
		
		input.stream().reduce((a,b) -> a+b); 
		
	}
}
