package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		
		List<String> city = Arrays.asList("Daltonganj","Garhwa","Latehar","Palamu","Hyderabad","Pune","Mumbai");
		
		 Map<Integer, List<String>> output = city.stream().filter(l -> l.length() > 6).collect(Collectors.groupingBy(w -> w.length()));
		 
		 System.out.println(output);
		 
		Long outpur1 =  city.stream().collect(Collectors.counting());
		
		System.out.println(outpur1);
	}

}
