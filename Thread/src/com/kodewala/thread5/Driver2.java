package com.kodewala.thread5;

import java.util.concurrent.locks.ReentrantLock;

class Bank{
	
	int balance = 1000;
	
	ReentrantLock lock = new ReentrantLock();
	
	public void withdraw(String name, int amount) {
		
		lock.lock();
		
		try {
			System.out.println("Entered");
			
			if(balance >= amount) {
				System.out.println(name + " withdrawing" );
				
				balance = balance - amount;
				
				System.out.println("Remaining " + balance);
			} else {
				System.out.println("Insufficient Balance");
			}
		}finally {
			lock.unlock();
		}
	}
}

public class Driver2 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Thread t1 = new Thread(() -> bank.withdraw("abhishek", 400));
		
		Thread t2 = new Thread(() -> bank.withdraw("piyush", 800));
		
		t1.start();
		t2.start();
		
		
	}
}
