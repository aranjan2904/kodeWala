package com.kodewala.collection1;

import java.util.ArrayList;

public class EmployeeManagement {
	public static void main(String[] args) {

		// Create ArrayList to store employee names
		ArrayList<String> employeeList = new ArrayList<String>();

		// Adding employee names
		employeeList.add("Abhishek");
		employeeList.add("piyush");
		employeeList.add("ganpat");
		employeeList.add("vikash");
		employeeList.add("raju");
		

		// Display total employees
		System.out.println("Total Employees: " + employeeList.size());

		System.out.println("----------");

		// Print employee names having length greater than 5
		for (int i = 0; i < employeeList.size(); i++) {

			String currentEmployee = employeeList.get(i);

			if (currentEmployee.length() > 5) {
				System.out.println(currentEmployee);
			}
		}
	}
}
