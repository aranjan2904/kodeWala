package com.kodewala.set;

class Student5 {
	int rollNumber;
	String name;
	
	
	public Student5(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student5 s = (Student5) obj;
		return this.rollNumber == s.rollNumber;
	}
	
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	
	
	
}

public class Driver3 {
	public static void main(String[] args) {
		
		Student5 s1 = new Student5(101, "Ganpat");
		Student5 s2 = new Student5(102, "Piyush");
		
		System.out.println();
		
	}
}
