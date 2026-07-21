package com.kodewala.set2;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name.equals(s.name) & this.rollNo == s.rollNo;
	}
	
	public int hashCode() {
		return this.name.hashCode() + this.rollNo;
	}
	
	
}

public class Driver {
	public static void main(String[] args) {
		
		Student std1 = new Student("Abhishek",1);
		Student std2 = new Student("Sumit",2);
		Student std3 = new Student("Abhishek",1);
		
		
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(std1);
		stdSet.add(std2);
		stdSet.add(std3);
		
		System.out.println(stdSet.size());
		
		
		
	}
}
