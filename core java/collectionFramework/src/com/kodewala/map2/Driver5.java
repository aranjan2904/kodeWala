package com.kodewala.map2;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}

public class Driver5 {
	public static void main(String[] args) {
		
		List<Student> list = new CopyOnWriteArrayList<Student>();
		
		list.add(new Student(1, "abhi"));
		list.add(new Student(2, "Raushan"));
		
	}
}
