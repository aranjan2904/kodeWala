package com.kodewala.exception4;

public class Driver3 {

	public static void main(String[] args) {
		
		int age = 15;
		
		if(age < 18) {
			throw new InvalidAgeException("not eligible for voting");
		}
		
		System.out.println("Eligible for voting");
	}
}
