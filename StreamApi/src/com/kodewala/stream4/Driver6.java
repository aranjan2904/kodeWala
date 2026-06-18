package com.kodewala.stream4;

import java.util.Optional;

public class Driver6 {
	public static void main(String[] args) {
		
		String word = "swiss";
		
		Optional<Character> output =  word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();
		
		System.out.println(output.get());
		
		
	}
}
