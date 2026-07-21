package com.kodewala.set3;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.id == s.id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
}
