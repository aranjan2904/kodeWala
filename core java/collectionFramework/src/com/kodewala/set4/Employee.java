package com.kodewala.set4;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee e) { // -ve or Zero or +ve
		return(this.name.compareTo(e.name));
	}
	
}