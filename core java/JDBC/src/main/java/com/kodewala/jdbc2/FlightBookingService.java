package com.kodewala.jdbc2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlightBookingService {
	
	public void bookTicket() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		Statement stmt = connection.createStatement();
		
		String query = "insert into ticket values(1,'indigoA40');
	}
}
