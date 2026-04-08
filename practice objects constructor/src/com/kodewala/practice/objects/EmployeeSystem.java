package com.kodewala.practice.objects;

class Employee{
	String name;
	double salary;
	
	public Employee(String _name, double _salary) {
		this.name = _name;
		this.salary = _salary;
	}
}

class Developer extends Employee{
	String language;
	int experience;
	
	public Developer(String _name, double _salary, String _language) {
		this(_name,_salary,_language,2);
	}
	public Developer(String _name,double _salary,String _language,int _experience) {
		super(_name,_salary);
		this.language = _language;
		this.experience = _experience;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(language);
		System.out.println(experience);
	}
}

public class EmployeeSystem {
	public static void main(String[] args) {
		
		Developer developer = new Developer("abhishek", 100000, "Java");
		developer.display();
	}
}
