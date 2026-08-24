package com.kodewala.employee;

import com.kodewala.address.Address;

public class Employee {
	
	private int empId;
	private String name;
	
	
	private Address address;


	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void printInfo() {
		address.display();
	}
	
	
	
	

}
