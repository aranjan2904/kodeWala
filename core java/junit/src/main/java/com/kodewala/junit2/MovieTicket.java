package com.kodewala.junit2;


public class MovieTicket {

    public double calculatePrice(double price, String category) {

        if (category.equals("STUDENT")) {
            price = price * 0.80;
        } else if (category.equals("SENIOR")) {
            price = price * 0.70;
        } else if (category.equals("CHILD")) {
            price = price * 0.50;
        }

        return price;
    }
}