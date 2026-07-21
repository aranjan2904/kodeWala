package com.kodewala.inheritance;

abstract class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		setName(name);
		// this.name = name;
		setSalary(salary);
		// this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary cannot be Zero");
		}
	}

}

class Manager extends Employee {
	private String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		// this.department = department;
		setDepartment(department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department == null || department.trim().isEmpty()) {
			throw new IllegalArgumentException("Department cannot be empty");
		}
		this.department = department;

	}

}

public class EmployeeSystem {
	public static void main(String[] args) {

		Manager manager = new Manager("Abhishek", 70000, "IT");

		manager.setName("Vikash");
		manager.setDepartment("Law");
		manager.setSalary(60000);

		System.out.println(manager.getName());
		System.out.println(manager.getSalary());
		System.out.println(manager.getDepartment());

	}
}
