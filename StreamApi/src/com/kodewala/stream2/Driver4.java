package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;

public class Driver4 {
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Delhi", "Banglore", "Chennai", "Hyderabad");
		
		cities.stream().filter(l -> l.length() > 6).forEach(e -> System.out.println(e));
		
	}
}
