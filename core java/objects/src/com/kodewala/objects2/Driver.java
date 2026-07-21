package com.kodewala.objects2;

class OrderMgmt {
    OrderMgmt() {
        super(); // calls Object class constructor
        System.out.println("OrderMgmt.OrderMgmt()");
    }
}

class Order extends OrderMgmt {

    public Order() {
        this("kodewala");   // 🔥 calling another constructor
        System.out.println("Order.Order()");
    }

    public Order(String name) {
        super();  // 🔥 calling parent constructor
        System.out.println("Order.Order(name)");
    }
}
public class Driver extends Object {

    public static void main(String[] args) {
        Order ord = new Order(); // call the constructor
        System.out.println();
    }
}
