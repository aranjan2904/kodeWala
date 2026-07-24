package com.kodewala.employee;

import com.kodewala.address.Address;

public class Employee {
	
	private int empId;
	private String fullName;
	private Address address;
	
	
	public Employee(int empId, String fullName, Address address) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.address = address;
	}

	
	public void display() {
		System.out.println( "Employee [empId=" + empId + ", fullName=" + fullName + ", address=" + address + "]");
	}
	

}
