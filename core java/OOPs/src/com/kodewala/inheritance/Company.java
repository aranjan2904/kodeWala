package com.kodewala.inheritance;

class Worker {
	private String name;
	private double salary;

	public Worker(String name, double salary) {
		setName(name);
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class Developer extends Worker {
	private String programmingLanguage;

	public Developer(String name, double salary, String programmingLanguage) {
		super(name, salary);
		setProgrammingLanguage(programmingLanguage);
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

}

public class Company {
	public static void main(String[] args) {
		Developer developer = new Developer("abhishek", 120000, "JAVA");
		developer.setSalary(500000);
		System.out.println(developer.getName());
		System.out.println(developer.getSalary());
		System.out.println(developer.getProgrammingLanguage());
	}
}
