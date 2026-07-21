package com.kodewala.thread4;

class Work{
	public  void doWork() {
		
		System.out.println("Work.doWork()" + Thread.currentThread().getName());
		
	}
	
}

class Worker extends Thread{
	
	Work work;
	
	public Worker(Work work) {
		this.work = work;
	}
	
	public void run() {
		
		
		work.doWork();
	}
}

public class Driver4 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Work work = new Work();
		
		Worker t1 = new Worker(work);
		t1.start();
		
		Worker t2 = new Worker(work);
		t2.start();
		
		System.out.println("end");
	}

}
