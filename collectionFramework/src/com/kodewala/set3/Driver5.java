package com.kodewala.set3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver5 {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Abhishek Ranjan");
		Student s2 = new Student(102, "Suraj Kumar");
		Student s3 = new Student(103, "Mohan Kumar");
		Student s4 = new Student(104, "Suresh kumar");
		Student s5 = new Student(101, "Abhishek Ranjan");
		Student s6 = new Student(105, "Suraj Kumar");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);
		
		System.out.println(studentSet);
		
		for(Student std : studentSet) {
			System.out.println(std.name);
		}
		
		System.out.println("------------------");
		
		Iterator<Student> itr =  studentSet.iterator();
		
		while(itr.hasNext()) {
			Student std = itr.next();
			System.out.println(std.name);
		}
	}
}
