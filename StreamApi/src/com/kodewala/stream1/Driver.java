package com.kodewala.stream1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		
		//storing brand name in arrayList collection
		List<String> brand = Arrays.asList("realme", "apple", "redme", "micromax", "nokia", "vivo","nothing");
		
		
		System.out.println("Input List : " + brand);
		
		
		//converting collection to stream for processing
		Stream<String> stream = brand.stream();
		
		
		//using map iterating to all element in collection and performing operation to each element
		Stream<String> streamUpperCase = stream.map(word -> word.toUpperCase());
		
		
		//after processing converting stream back to list
		List<String> processedBrand = streamUpperCase.collect(Collectors.toList());
		
		
		System.out.println("Processed list : " + processedBrand);
	}
}
