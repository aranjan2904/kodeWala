package com.kodewala;

import java.sql.SQLException;

public class Driver {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        EmployeeService service = new EmployeeService();

        // CREATE
        service.addEmployee("Ranjan", "Java", 60000);

        service.addEmployee("Rahul", "Testing", 45000);

        // READ
        service.getAllEmployees();

        // UPDATE
        service.updateSalary(1, 70000);

        // DELETE
        service.deleteEmployee(2);

        // READ AGAIN
        service.getAllEmployees();
    }
}