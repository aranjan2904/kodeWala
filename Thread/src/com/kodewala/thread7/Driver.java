package com.kodewala.thread7;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("my thread START :" + Thread.currentThread().getName());
		Thread.yield(); //pause the current thread and give chance to other
		System.out.println("my thread END :" + Thread.currentThread().getName());
	}
}

public class Driver {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
	}
}
