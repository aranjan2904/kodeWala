package com.kodewala.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAdmissionService {

    public void admitStudent() throws ClassNotFoundException, SQLException {

    	Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");

        try {

            connection.setAutoCommit(false);

            Statement stmt = connection.createStatement();

            // Insert Student
            String studentQuery =
                    "INSERT INTO student(id, name, status) VALUES(101,'Ranjan','PENDING')";

            int studentResult = stmt.executeUpdate(studentQuery);

            if(studentResult > 0) {
                System.out.println("Student record inserted");
            }

            // Insert Fee
            String feeQuery =
                    "INSERT INTO fees(id, amount, status) VALUES(101,50000,'PENDING')";

            int feeResult = stmt.executeUpdate(feeQuery);

            if(feeResult > 0) {
                System.out.println("Fee record inserted");
            }

            // Update Student Status
            String updateStudent =
                    "UPDATE student SET status='ADMITTED' WHERE id=101";

            stmt.executeUpdate(updateStudent);

            // Update Fee Status
            String updateFee =
                    "UPDATE fees SET status='PAID' WHERE id=101";

            stmt.executeUpdate(updateFee);

            connection.commit();

            System.out.println("Admission Successful");

        } catch (SQLException e) {

            connection.rollback();

            System.out.println("Admission Failed");

            e.printStackTrace();

        } finally {

            connection.close();

        }

    }

}