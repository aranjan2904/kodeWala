package com.kodewala.set4;

public class Student implements Comparable<Student>{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		return (this.name.compareTo(s.name));
	}
}
