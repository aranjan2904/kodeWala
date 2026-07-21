package com.kodewala.collection2;

import java.util.ArrayList;

public class CompanyRegistry {
    public static void main(String[] args) {
        
    	Employee emp1 = new Employee("E101", null, "IT", "85000");
    	Employee emp2 = new Employee("E102", "Aman", "HR", "60000");
    	Employee emp3 = new Employee("E103", "Priya", "Finance", "75000");
    	Employee emp4 = new Employee("E104", "Sneha", "IT", "70000");
    	Employee emp5 = new Employee("E105", "Karan", "Sales", "65000");
    	Employee emp6 = new Employee("E106", "Neha", "Development", "95000");
    
        Employee emp7 = new Employee("E107", "Ganpat", null, "70000"); 
        
        Employee emp8 = new Employee("E108", "vikash", "IT", "95000");


        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
       
        
   
        employeeList.add(null);  
        
        employeeList.add(emp8);

        int itDepartmentCount = 0;
        
        
        for (int i = 0; i < employeeList.size(); i++) {
            try {
                Employee currentEmployee = employeeList.get(i);
                
            
                if (currentEmployee.getDepartment().equals("IT")) {
                    System.out.println("IT employee Found: " + currentEmployee.getName() + " (ID: " + currentEmployee.getEmployeeId() + ")");
                    itDepartmentCount = itDepartmentCount + 1;
                }
                
            } catch (NullPointerException e) {
                
                System.out.println("Error: employee not found");
            }
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total employees in IT: " + itDepartmentCount);
    }
}