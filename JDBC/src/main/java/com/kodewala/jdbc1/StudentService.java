package com.kodewala.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentService {

    // Insert Student
    public void addStudent(String name, String course, int marks)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "INSERT INTO student(name,course,marks) VALUES('"
                + name + "','" + course + "'," + marks + ")";

        int result = stmt.executeUpdate(query);

        System.out.println(result + " Student Added Successfully");
    }

    // Get All Students
    public void getAllStudents()
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM student";

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            System.out.println("------------------------");
            System.out.println("ID      : " + rs.getInt("id"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Marks   : " + rs.getInt("marks"));
        }
    }

    // Get Student By ID
    public void getStudentById(int id)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM student WHERE id=" + id;

        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {

            System.out.println("ID      : " + rs.getInt("id"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Marks   : " + rs.getInt("marks"));

        } else {

            System.out.println("Student Not Found");
        }
    }

    // Update Student Marks
    public void updateMarks(int id, int marks)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "UPDATE student SET marks=" + marks + " WHERE id=" + id;

        int result = stmt.executeUpdate(query);

        if (result > 0) {
            System.out.println("Student Updated Successfully");
        } else {
            System.out.println("Student Not Found");
        }
    }

    // Delete Student
    public void deleteStudent(int id)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodewala",
                "root",
                "Shubham@2904");

        Statement stmt = connection.createStatement();

        String query = "DELETE FROM student WHERE id=" + id;

        int result = stmt.executeUpdate(query);

        if (result > 0) {
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("Student Not Found");
        }
    }
}