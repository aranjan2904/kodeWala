package com.kodewala.object4;

class Employee {
	public static int empId = 0;
	private String name;
	private int id;
	
	public Employee(String _name) {
		this.name = _name;
		this.id = empId;
		
		{
			empId = empId +1;
			System.out.println("Employee name: "+name);
			System.out.println("Employee ID: Kodewala "+Employee.empId);
			System.out.println("------------------");
		}
	}
	
}

public class kodewala {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Abhishek");
		Employee employee2 = new Employee("Rahul");
		Employee employee3 = new Employee("Sumit");
		
		
	}
}
