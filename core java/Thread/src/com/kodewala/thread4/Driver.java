package com.kodewala.thread4;

class BankAccount {
	private int balance = 10000;

	public void withdraw(int amount) {

		synchronized (this) { // synchronized block is preferred because it block only area where thread safety is required, rather than whole method like (method synchronization);
			if (balance >= amount) {

				System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance = balance - amount;

				System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance = " + balance);

			} else {

				System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
			}
		}
	}

	public int getBalance() {
		return balance;
	}
}

class Customer extends Thread {

	BankAccount bankAccount;

	public Customer(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public void run() {
		bankAccount.withdraw(7000);
	}
}

public class Driver {

	public static void main(String[] args) throws InterruptedException {

		BankAccount account = new BankAccount();

		Customer customer1 = new Customer(account);
		Customer customer2 = new Customer(account);

		customer1.start();
		customer2.start();

		customer1.join();
		customer2.join();

		System.out.println("Final balance = " + account.getBalance());
	}
}