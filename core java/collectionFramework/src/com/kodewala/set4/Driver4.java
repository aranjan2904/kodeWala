package com.kodewala.set4;

import java.util.TreeSet;

public class Driver4 {
	public static void main(String[] args) {
		
		TreeSet<Student> stdSet = new TreeSet<Student>();
		
		stdSet.add(new Student("Abhishek"));
		stdSet.add(new Student("Saurabh"));
		
		for(Student s : stdSet) {
			System.out.println(s.name);
		}
	}
}
