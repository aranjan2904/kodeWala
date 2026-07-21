package com.kodewala.thread4;

class BankAccount2 {
    private int balance = 10000;

    public synchronized void withdraw(int amount) { 

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " completed withdrawal. Balance = " + balance);

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " Insufficient Balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Customer2 extends Thread {

    BankAccount2 bankAccount;

    public Customer2(BankAccount2 bankAccount) {
        super();
        this.bankAccount = bankAccount;
    }

    public void run() {
        bankAccount.withdraw(7000);
    }
}

public class Driver2 {

    public static void main(String[] args) throws InterruptedException {

        BankAccount2 account = new BankAccount2();

        Customer2 customer1 = new Customer2(account);
        Customer2 customer2 = new Customer2(account);

        customer1.start();
        customer2.start();
        
        customer1.join();
        customer2.join();
        
        System.out.println("Final balance = " + account.getBalance());
    }
}