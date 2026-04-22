package com.kodewala.polymorphism;

class PaymentSystem1 {
}

class OnlinePayment extends PaymentSystem1 {
}

public class MainApp {

    public static void main(String[] args) {

        // Direct object creation
        OnlinePayment onlinePayment = new OnlinePayment(); // sample

        // ✅ Upcasting (Parent reference → Child object)
        PaymentSystem1 payment = (PaymentSystem1) new OnlinePayment(); // auto upcasting

        // ❌ Downcasting (Wrong way - will cause runtime error)
        OnlinePayment onlinePayment2 = (OnlinePayment) new PaymentSystem1(); // downcasting

        // Type     ref name      = Actual object
        // int      amount        = 100;
    }
}