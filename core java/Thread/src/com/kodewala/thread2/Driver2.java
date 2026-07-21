package com.kodewala.thread2;

//Understanding the LifeCycle of Thread.
// New Born --> RUNNABLE --> RUNNING --> Sleep/wait/pause --> RUNNABLE --> RUNNING --> Terminate.

class MyThread1 implements Runnable {
	
	@Override
	public void run() {  // 3. RUNNING
		System.out.println("MyThread1.run()");
		System.out.println("MyThread1.run()");
		System.out.println("MyThread1.run()");
		System.out.println("MyThread1.run()");
		// 4. here or in middle of the method running t1 can go to Sleep/wait/pause state.
		// once waiting/sleep is over, t1 again move to RUNNABLE state then move to RUNNING state
		
		System.out.println("MyThread1.run()");
		System.out.println("MyThread1.run()");
		System.out.println("MyThread1.run()");
	} // 5. after method completion, thread t1 is terminated .
}

public class Driver2 {
	public static void main(String[] args) {
		
		MyThread1 myThread1 = new MyThread1();
		
		Thread t1 = new Thread(myThread1); // 1. New Born (Thread object created)
		t1.start(); // 2. RUNNABLE
		
		
		// t1.start();  // you can't restart the thread, thread once terminated cannot restart/born. 
		
	}
}
