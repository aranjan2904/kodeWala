package com.kodewala.jdbc2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankingService {
	
	public void doTransfer() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		try {
			
			connection.setAutoCommit(false);
			
			Statement stmt = connection.createStatement();
			
			//Debit Money
			
			 int resultDebit = stmt.executeUpdate("UPDATE account SET balance = balance -500 WHERE id = 1");
			 
			 if(resultDebit > 0) {
				 System.out.println("Debit successfull");
			 }else {
				 System.out.println("Debit did not happen");
			 }
			 
			 //Credit Money
			 
			 int resultCredit = stmt.executeUpdate("update account set balance = balance + 500 where id = 2");
			 
			 if(resultCredit > 0) {
				 System.out.println("credit successfull");
			 }else {
				 System.out.println("credit dit not happen");
			 }
			 
			 connection.commit();
			 
			
		}catch(Exception e) {
			connection.rollback();
			System.out.println("Transfer failed");
		}
	}

}
