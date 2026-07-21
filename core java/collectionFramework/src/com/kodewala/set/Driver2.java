package com.kodewala.set;

class Employee2 {

    int id;
    String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        Employee2 e2 = (Employee2) obj;

        return this.id == e2.id;
    }

    @Override
    public int hashCode() {

        return this.id;
    }
}

public class Driver2 {

    public static void main(String[] args) {

        Employee2 e1 = new Employee2(101, "Abhishek");
        Employee2 e2 = new Employee2(101, "Rahul");

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}