package com.kodewala.jdbc1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookService {

	public void addBook(String name, double price, String status) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root","Shubham@2904");
		 
		// Statement stmt =  connection.createStatement();
		 
		 
		 
		 
		 
	}

}
