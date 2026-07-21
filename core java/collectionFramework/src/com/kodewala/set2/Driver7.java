package com.kodewala.set2;
import java.util.HashSet;

class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id & this.name.equals(e.name);
	}
	
//	@Override
//	public String toString() {
//		return id + name;
//	}
}

public class Driver7 {
	public static void main(String[] args) {
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		
		empSet.add(new Employee(101, "Rahul"));
		empSet.add(new Employee(102, "Aman"));
		empSet.add(new Employee(101, "Rahul"));
		
		System.out.println(empSet);
		
		}
}
