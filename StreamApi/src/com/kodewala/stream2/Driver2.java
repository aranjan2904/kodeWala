package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		
	
		List<List<String>>  product = Arrays.asList(Arrays.asList("Laptop", "Mouse", "Screen"), Arrays.asList("Keyboard", "Desk"), Arrays.asList("Pen", "Bag"));
		
		System.out.println("2D Array " + product);
		
		
		//flatMap() is used to convert 2D Array to 1D array
		List<String> flattenMap = product.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println("1D Array " + flattenMap);
		
		
		//forEach() is another terminator operator
		flattenMap.stream().filter(w -> w.startsWith("M") && (w.length() > 3)).forEach(word -> System.out.println(word));
		
		
	}
}
