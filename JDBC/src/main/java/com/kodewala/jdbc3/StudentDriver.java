package com.kodewala.jdbc3;

import java.io.IOException;
import java.sql.SQLException;

public class StudentDriver {
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		
//		try {
//			student.updateStudentDetails(1, "abhishek", "paid");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			student.insertStudentDetails();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}