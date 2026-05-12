package com.kodewala.exception4;

import java.io.IOException;

import com.kodewala.exception3.FileReader;

public class Test {
	public void readFile() throws IOException {
		
		FileReader fr = new FileReader();
		
		System.out.println("File opened");
	}
	
	public void checkAge(int age) throws InvalidAgeOneException {
		
		if(age < 18) {
			throw new InvalidAgeOneException("age must be 18");
		}
	}
}
