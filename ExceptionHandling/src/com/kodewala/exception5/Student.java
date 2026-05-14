package com.kodewala.exception5;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(rollNo
				+ " "
				+ name
				+ " "
				+ marks);
	}
}
