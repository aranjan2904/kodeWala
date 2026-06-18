package com.kodewala.stream1;

import java.util.*;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		
		List<String> products = Arrays.asList("laptop", "mouse", "keyboard", "tv", "toaster","microwave", "airfryer","fan");
		
		System.out.println(products);
		
		List<String> processed  = products.stream().filter(f -> f.startsWith("m")).map(word -> word.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(processed);
		
	}
}
