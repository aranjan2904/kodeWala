package com.ecommerce.service;

import java.util.Scanner;

import com.ecommerce.dao.SellerDAO;
import com.ecommerce.exception.DuplicateEmailException;
import com.ecommerce.model.Seller;

public class SellerService {

    private SellerDAO sellerDAO = new SellerDAO();
    private Scanner sc = new Scanner(System.in);

    // Seller Registration
    public Seller sellerRegistration() throws DuplicateEmailException {

        System.out.println("\n========== SELLER REGISTRATION ==========");

        String name;
        while (true) { 
            System.out.print("Enter Name : ");
            name = sc.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            }

            System.out.println("Name cannot be empty.");
        }

        String email;
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

        if (sellerDAO.emailExists(email)) {
            throw new DuplicateEmailException("Email already exists.");
        }

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        System.out.print("Enter Shop Name : ");
        String shopName = sc.nextLine();

        Seller seller = new Seller(name, email, password, shopName);

        boolean saved = sellerDAO.registerSeller(seller);

        if (saved) {
            System.out.println("\nSeller Registered Successfully.");
        } else {
            System.out.println("\nRegistration Failed.");
        }

        return seller;
    }

    // Seller Login
    public Seller sellerLogin() {

        System.out.println("\n============== SELLER LOGIN ==============");

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

        Seller seller = sellerDAO.loginSeller(email, password);

        if (seller == null) {
            System.out.println("Invalid Email or Password.");
        } else {
            System.out.println("Welcome " + seller.getName());
        }

        return seller;
    }
}