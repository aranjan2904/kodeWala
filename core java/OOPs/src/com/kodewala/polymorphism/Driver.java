package com.kodewala.polymorphism;

class Notification {
    void send() {
        System.out.println("Sending generic notification");
    }
}

class EmailNotification extends Notification1 {
    @Override
    void send() {
        System.out.println("Sending Email notification");
    }
}

class SmsNotification extends Notification1 {
    @Override
    void send() {
        System.out.println("Sending SMS notification");
    }
}

public class Driver {
    public static void main(String[] args) {

        Notification1 notification = new EmailNotification(); // upcasting

        notification.send();
      
    }
}