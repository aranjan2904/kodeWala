package com.kodewala.user;

public class User {

    public void userDetails() {

        String name = "Abhishek Ranjan";
        int age = 25;
        String email = "abhishek@example.com";
        String mobile = "9876543210";
        String city = "Bangalore";
        String profession = "Software Developer";

        System.out.println("------ User Details ------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Email      : " + email);
        System.out.println("Mobile     : " + mobile);
        System.out.println("City       : " + city);
        System.out.println("Profession : " + profession);
    }
}