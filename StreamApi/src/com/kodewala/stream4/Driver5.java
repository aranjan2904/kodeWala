package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver5 {
	public static void main(String[] args) {
		
		List<String> city = Arrays.asList("Daltonganj","Garhwa","Latehar","Palamu","Hyderabad","Pune","Mumbai");
		
		Map<Boolean, List<String>> output = city.stream().collect(Collectors.partitioningBy(w -> w.length() > 6));
		
		System.out.println(output);
		
		
	}
}
