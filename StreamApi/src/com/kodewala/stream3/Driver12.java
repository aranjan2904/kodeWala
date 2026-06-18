package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
}

public class Driver12 {
	public static void main(String[] args) {
		
		List<Student> input = Arrays.asList(new Student("Rahul"), new Student("Abhishek"), new Student("Piyush"));
		
		Map<Integer, Long> output = input.stream().collect(Collectors.groupingBy(s -> s.name.length(),Collectors.counting()));
		
		System.out.println(output);
	}
}
