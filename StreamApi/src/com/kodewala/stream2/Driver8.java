package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(5,3,1,7,4,9,6,1,2,3);
		
		List<Integer> sortedNumnums = nums.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(sortedNumnums);
	}
}
