package com.kodewala;

import java.sql.SQLException;

public class StudentDriver {
	public static void main(String[] args) {
		
		StudentService student = new StudentService();
		
		try {
			student.addStudent("abhishek", "B.Tech", 8);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			student.getAllStudents();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			student.getStudentById(2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
