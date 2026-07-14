package com.kodewala.jdbc2;

import java.sql.SQLException;

public class StudentDriver {
	public static void main(String[] args) {
		
		StudentAdmissionService student = new StudentAdmissionService();
		
		try {
			student.admitStudent();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
