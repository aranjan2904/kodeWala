package com.kodewala.thread2;

class Student implements Runnable {
	
	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			try {
				System.out.println(i + " by " + Thread.currentThread().getName());
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Driver5 {
	public static void main(String[] args) {
		Student student = new Student();
		
		Thread t1 = new Thread(student);
		Thread t2 = new Thread(student);
		t1.start();
		t2.start();
	}
}
