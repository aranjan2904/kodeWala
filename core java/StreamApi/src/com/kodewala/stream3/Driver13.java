//package com.kodewala.stream3;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import org.w3c.dom.css.Counter;
//
//public class Driver13 {
//	public static void main(String[] args) {
//		
//		String str = "abbcccdddd";
//		
//		Map<Character, Long> output = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
//		
//		System.out.println(output);
//		
//	}
//}
