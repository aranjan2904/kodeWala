package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver7 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,5,7,8,1);
		
		List<Integer> squareNumber = nums.stream().map(n -> n*n).collect(Collectors.toList());
		
		System.out.println(squareNumber);
		
	}
}
