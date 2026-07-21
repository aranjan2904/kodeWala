package com.kodewala.set;

class Employee {
	String firstName;
	String secondName;

	public Employee(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	@Override
	public boolean equals(Object obj2) {
		Employee e2 = (Employee) obj2;
		return this.firstName.equals(e2.firstName) & this.secondName.equals(e2.secondName);
	}
	
	@Override
	public int hashCode() {
		return this.firstName.hashCode()+this.secondName.hashCode();
	}
	
}

public class Equals {
	public static void main(String[] args) {

		Employee e1 = new Employee("Abhishek", "Ranjan");
		Employee e2 = new Employee("Abhishek", "Ranjan");

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() + " " + e2.hashCode());
	}
}
