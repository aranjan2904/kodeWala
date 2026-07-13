package com.kodewala.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentService {

    public void getAllPayment(String _status) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/kodewala", "root","Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = null;
        
        if(_status == null) {
        	query = "SELECT * FROM payment";
        }else {
        	query = "SELECT * FROM payment where status = '" + _status + "'";
        }

        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()) {
        	int id = rs.getInt(1);
        	String name = rs.getString(2);
        	String status = rs.getString(3);
        	
        	System.out.println("ID   : " + id);
        	System.out.println("Name  : " + name);
        	System.out.println("Status   : " + status);
        	System.out.println("--------------");
        }
        
    }
    
    
    public void updatePayment(int id, String _status) throws ClassNotFoundException, SQLException {
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root", "Shubham@2904");
    	
    	
    	Statement stmt = connection.createStatement();
    	
    	String query = "UPDATE payment SET status = '" + _status + "' WHERE id = " + id;
    	
    	int result  = stmt.executeUpdate(query);
    	
    	System.out.println(result);
    	
    	
    }
}