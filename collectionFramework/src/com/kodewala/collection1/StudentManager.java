package com.kodewala.collection1;

import java.util.ArrayList;

public class StudentManager {
	public static void main(String[] args) {

		// Create ArrayList to store student names
		ArrayList<String> studentList = new ArrayList<String>();

		// Adding student names
		studentList.add("Abhishek");
		studentList.add("Rahul");
		studentList.add("Sumit");
		studentList.add("piyush");
		studentList.add("Ganpat");
		

		// Accessing element using index
		System.out.println(studentList.get(3));

		System.out.println("----------");

		// Print names starting with S
		for (int i = 0; i < studentList.size(); i++) {

			String currentStudent = studentList.get(i);

			if (currentStudent.toUpperCase().startsWith("S")) {
				System.out.println(currentStudent);
			}
		}
	}
}