package com.kodewala.thread4;

class BankAccount3 {
	private static int balance = 10000;

	public static void withdraw(int amount) { //if method is static, then thread require class lock, because static method have no object

		synchronized (BankAccount.class) { // here argument pass
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

class Customer3 extends Thread {

	BankAccount3 bankAccount;

	public Customer3(BankAccount3 bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public void run() {
		bankAccount.withdraw(7000);
	}
}

public class Driver3 {

	public static void main(String[] args) throws InterruptedException {

		BankAccount3 account = new BankAccount3();

		Customer3 customer1 = new Customer3(account);
		Customer3 customer2 = new Customer3(account);

		customer1.start();
		customer2.start();

		customer1.join();
		customer2.join();

		System.out.println("Final balance = " + account.getBalance());
	}
}