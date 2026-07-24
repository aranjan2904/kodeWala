package com.kodewala.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Student() {
		System.out.println("Student bean created");
	}
	
	public void study() {
		System.out.println("Studing.....");
	}
}
