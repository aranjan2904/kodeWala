package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeService {

    // Create Employee
    public void addEmployee(String name, String department, double salary)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "INSERT INTO employee(name, department, salary) VALUES('"
                + name + "','" + department + "'," + salary + ")";

        int result = stmt.executeUpdate(query);

        System.out.println(result + " Employee Added");
    }

 
    public void getAllEmployees() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM employee";

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            int id = rs.getInt(1);
            String name = rs.getString(2);
            String department = rs.getString(3);
            double salary = rs.getDouble(4);

            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Department : " + department);
            System.out.println("Salary : " + salary);
            System.out.println("----------------------");
        }
    }

    // Read Employee By ID
    public void getEmployeeById(int id)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodwala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM employee WHERE id=" + id;

        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {

            System.out.println("ID : " + rs.getInt("id"));
            System.out.println("Name : " + rs.getString("name"));
            System.out.println("Department : " + rs.getString("department"));
            System.out.println("Salary : " + rs.getDouble("salary"));

        } else {
            System.out.println("Employee Not Found");
        }
    }

    // Update Employee Salary
    public void updateSalary(int id, double salary)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "UPDATE employee SET salary=" + salary +
                " WHERE id=" + id;

        int result = stmt.executeUpdate(query);

        System.out.println(result + " Record Updated");
    }

    // Delete Employee
    public void deleteEmployee(int id)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "DELETE FROM employee WHERE id=" + id;

        int result = stmt.executeUpdate(query);

        System.out.println(result + " Record Deleted");
    }
}