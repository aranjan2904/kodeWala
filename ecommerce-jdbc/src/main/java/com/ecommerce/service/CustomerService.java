package com.ecommerce.service;

import java.util.Scanner;


import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.exception.DuplicateEmailException;
import com.ecommerce.model.Customer;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();
    private Scanner sc = new Scanner(System.in);

    //customer Registration
    public Customer customerRegistration() throws DuplicateEmailException{

        System.out.println("\n========= CUSTOMER REGISTRATION =========");
        
        String name = null;
        while (true) {
            System.out.print("Enter Name : ");
             name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            }

            System.out.println("Name cannot be empty.");
        }
        
        String email = null;

        while (true) {
            System.out.print("Enter Email : ");
            email = sc.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("Email cannot be empty.");
                continue;
            }

            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                System.out.println("Invalid email format.");
                continue;
            }

            break;
        }

        if (customerDAO.emailExists(email)) {
            throw new DuplicateEmailException("Email already registered.");
        }

        System.out.print("Enter Password : ");
        String password = sc.nextLine(); 

        System.out.print("Enter Address : ");
        String address = sc.nextLine();

        Customer customer = new Customer(name, email, password, address);

        boolean saved = customerDAO.registerCustomer(customer);

        if (saved) {
            System.out.println("\nRegistration Successful.");
        } else {
            System.out.println("\nRegistration Failed.");
        }

        return customer;
    }

    //customer login
    public Customer customerLogin() {

        System.out.println("\n============ CUSTOMER LOGIN ============");

        String email;

        while (true) {
            System.out.print("Email : ");
            email = sc.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("Email cannot be empty.");
                continue;
            }

            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                System.out.println("Invalid email format.");
                continue;
            }

            break;
        }

        System.out.print("Password : ");
        String password = sc.nextLine();

        Customer customer = customerDAO.loginCustomer(email, password);

        if (customer == null) {
            System.out.println("Invalid Email or Password.");
        } else {
            System.out.println("Welcome " + customer.getName());
        }

        return customer;
    }
    
}