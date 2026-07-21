package com.kodewala.collection2;

import java.util.ArrayList;

public class PhoneInventory {
    public static void main(String[] args) {
        
        // Creating Smartphone objects
        Smartphone phone1 = new Smartphone("Galaxy S24", "Samsung", "Android", "Premium");
        Smartphone phone2 = new Smartphone("iPhone 15", "Apple", "iOS", "Premium");
        Smartphone phone3 = new Smartphone("Galaxy A55", "Samsung", "Android", "Mid-range");
        Smartphone phone4 = new Smartphone("Pixel 8", "Google", "Android", "Premium");
        Smartphone phone5 = new Smartphone("Nord CE 4", "OnePlus", "Android", "Budget");
        Smartphone phone6 = new Smartphone("Galaxy M34", "Samsung", "Android", "Budget");
        Smartphone phone7 = new Smartphone("iPhone SE", "Apple", "iOS", "Mid-range");
        Smartphone phone8 = new Smartphone("Galaxy Z Fold 5", "Samsung", "Android", "Ultra-Premium");

        // Initializing the ArrayList
        ArrayList<Smartphone> phoneList = new ArrayList<Smartphone>();
        
        // Adding smartphones to the list
        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);
        phoneList.add(phone4);
        phoneList.add(phone5);
        phoneList.add(phone6);
        phoneList.add(phone7);
        phoneList.add(phone8);

        int count = 0;
        
        // Looping through the list to filter "Samsung" phones
        for(int i = 0; i < phoneList.size(); i++) {
            Smartphone currentPhone = phoneList.get(i);
            
            if(currentPhone.getBrand().equals("Samsung")) {
                System.out.println(currentPhone.getModelName() + " (" + currentPhone.getPriceRange() + ")");
                count = count + 1;
            }
        }
        
        System.out.println("Total Samsung phones in stock: " + count);
    }
}