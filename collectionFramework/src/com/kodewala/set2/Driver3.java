package com.kodewala.set2;

import java.util.HashSet;

class Product {

    String name;

    Product(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Product p = (Product) obj;
    	return this.name.equals(p.name);
    }
    
    
    @Override
    public int hashCode() {
    	return 123456;
    }
}

public class Driver3 {
    public static void main(String[] args) {

        Product p1 = new Product("Mobile");
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Keyboard");
        Product p4 = new Product("Mouse");
        Product p5 = new Product("Monitor");
        Product p6 = new Product("Printer");
        Product p7 = new Product("Tablet");
        Product p8 = new Product("Camera");
        Product p9 = new Product("Table");
       

        HashSet<Product> set = new HashSet<>(64);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);

        System.out.println(set.size());
        
        set.add(p9);
        
        System.out.println(set.size());
        
        set.remove(p9);
        
        System.out.println(set.size());
    }
}