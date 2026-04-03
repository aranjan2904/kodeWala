package com.kodewala.objects3;

class Person{
	String name;
	
	Person(String _name){
		this.name = _name;
	}
}

class Student extends Person {
	String course;
	int age;
	
	Student(String _name,String _course){
		this(_name,_course,18);
	}
	
	Student(String _name, String _course, int _age){
		super(_name);
		this.course = _course;
		this.age = _age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
	}
}


public class Main {
	public static void main(String[] args) {
		Student std = new Student("abhishek","B.Tech");
		std.display();
	}
}
