package com.kodewala.thread1;

//creating own custom thread
class MyThread extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("MyThread run method  exucuting by : " + Thread.currentThread().getName());
		Work work = new Work();
		work.doWork();
	}
}


//creating own custom thread 2
class MyThread2 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("MyThread2 run method exucuting by : " + Thread.currentThread().getName());
	}
}


class Work {
	
	public void doWork() {
		System.out.println("Doing some work by : " + Thread.currentThread().getName());
	}
}


public class Driver1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Thread START : " + Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
		
		
		MyThread2 t3 = new MyThread2();
		t3.setName("T3");
		t3.start();
		
		System.out.println("Hello Thread END : " + Thread.currentThread().getName());
	}

}
