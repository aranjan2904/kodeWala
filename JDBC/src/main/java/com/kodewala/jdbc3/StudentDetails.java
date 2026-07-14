package com.kodewala.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

public class StudentDetails {
	
	public void updateStudentDetails(int id, String name, String status) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		
		String updateQuery = "update student set status = ?, name = ? where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(updateQuery);
		
		ps.setString(1, status);
		ps.setString(2, name);
		ps.setInt(3, id);
		
		int recordUpdate = ps.executeUpdate();
		
		if(recordUpdate > 0) {
			System.out.println("Record updated : " + recordUpdate);
		}else {
			System.err.println("unable to updata the record");
		}
		
	}
	
	public void insertStudentDetails(int id, String name, String status) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		String insertQuery = "insert into student(id,name,status) values(?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		
		for (int i = 0; i < 10; i++) {
			ps.setInt(1, i);
		}
	}
}
