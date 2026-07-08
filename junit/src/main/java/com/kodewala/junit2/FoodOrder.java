package com.kodewala.junit2;



public class FoodOrder {

    public double calculateBill(double amount, String coupon) {


        if (coupon.equals("SAVE10")) {
            amount = amount * 0.90;
        }
        else if (coupon.equals("SAVE20")) {
            amount = amount * 0.80;
        }
        else if (coupon.equals("FLAT100") && amount >= 1000) {
            amount = amount - 100;
        }

        if (amount < 100) {
            amount = 100;
        }

        return amount;
    }
}