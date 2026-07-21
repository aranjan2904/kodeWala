package com.kodewala.stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver10 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi", "Banglore", "Daltonganj", "Mumbai", "Delhi", "Daltonganj");
		
		Set<String> set = new HashSet<String>();
		
		cities.stream().filter(city -> !set.add(city)).forEach(System.out::println);
	}
}
