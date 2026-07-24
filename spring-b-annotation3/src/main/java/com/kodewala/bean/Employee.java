package com.kodewala.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	public Employee() {
		System.out.println("Employee object created");
	}
	
	public void display() {
		System.out.println("hello Employee");
	}

	
	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
