package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		
		List<String> city =  Arrays.asList("Daltonganj", "Ranchi", "Hyderabad", "Mumbai", "Kolkara", "Bangalore", "Chennai");
		
		//List<String> output = city.stream().filter(c -> c.startsWith("B")).filter(l -> l.length() > 6).collect(Collectors.toList());
		
		
		
		List<String> output = city.stream().filter(c -> c.startsWith("B") && (c.length() > 6)).collect(Collectors.toList());
		
		System.out.println(output);

	}
}
