package com.kodewala.thread2;

class MyThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("MyThread.run()");
	}
}

public class Driver {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(myThread);
		t1.start();
	}
}
