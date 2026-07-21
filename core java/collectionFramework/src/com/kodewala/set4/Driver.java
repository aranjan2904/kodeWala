package com.kodewala.set4;

import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Abhishek", 50000);
		Employee emp2 = new Employee("Rohit", 12000);
		
		
		TreeSet<Employee> treeSet = new  TreeSet<Employee>();
		
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(new Employee("Ajat", 50000));
		
		System.out.println(treeSet);
		
		for(Employee e : treeSet) {
			System.out.println(e.name);
		}
	}
}
