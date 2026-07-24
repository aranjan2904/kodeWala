package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //This class is a bean, create its object automatically and manage it in the ioc container
public class Student {
	
	
	private int id = 56;
	
	@Value("ranjan")
	private String name;
	
	public Student() {
		System.out.println("student object created");
	}
	
	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
	}
	
	

}
