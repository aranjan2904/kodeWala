package com.kodewala.polymorphism;

class Employee {
	void work() {
		System.out.println("Employee");
	}
}

class Developer extends Employee {
	@Override
	void work() {
		System.out.println("Developer");
	}
}

class Tester extends Employee {
	@Override
	void work() {
		System.out.println("Tester");
	}
}

class Manager extends Employee {
	@Override
	void work() {
		System.out.println("manager");
	}
}

//Processor

class EmployeeProcessor {
	void assignWork(Employee e) {
		e.work();
	}
}

public class EmployeeSystem {
	public static void main(String[] args) {
		
		EmployeeProcessor processor = new EmployeeProcessor();
		
		Employee emp1 = new Developer();
		Employee emp2 = new Tester();
		Employee emp3 = new Manager();
		
		processor.assignWork(emp1);

	}
}
