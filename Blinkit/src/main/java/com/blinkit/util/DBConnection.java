package com.blinkit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	

    private static final String URL = "jdbc:mysql://localhost:3306/blinkit_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Shubham@2904";

    public static Connection getConnection() throws ClassNotFoundException {

        Connection connection = null;

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database Connected Successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}