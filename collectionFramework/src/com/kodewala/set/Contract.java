package com.kodewala.set;

class Student{
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 123456;
	}
	
}

public class Contract {
	public static void main(String[] args) {
		
		//Contact1: If two object are equal then they return same hash code.
		String name1 = "Abhishek";
		String name2 = "Abhishek";
		
		System.out.println(name1.hashCode() + " and " + name2.hashCode());
		
		
		//Contract2: If two object are returning same hash code then they may or may not be equal.
		 Student s1 = new Student("Abhishek");
		 Student s2 = new Student("Ranjan");
		 
		 System.out.println(s1.hashCode() + " and " + s2.hashCode() + " and " + s1.equals(s2));
	}
	
}
