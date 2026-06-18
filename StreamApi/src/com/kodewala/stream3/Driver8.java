package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class Driver8 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(4,2,6,8,3,4,9,0,4,6);
		
		long count = input.stream().count();
	}
}
