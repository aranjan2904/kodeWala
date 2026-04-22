package com.kodewala.polymorphism;

class Notification {
    void send() {
        System.out.println("Sending generic notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email notification");
    }
}

class SmsNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS notification");
    }
}

public class Driver {
    public static void main(String[] args) {

        Notification notification = new EmailNotification(); // upcasting

        notification.send();
      
    }
}