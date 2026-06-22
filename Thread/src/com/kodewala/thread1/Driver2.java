package com.kodewala.thread1;

class MyThread4 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0; i < 10; i++) {
			System.out.println( i + " My Thread run is executed by: " +Thread.currentThread().getName());
		}
	}
}

public class Driver2 {
	public static void main(String[] args) {
		
		System.out.println("Driver2.main() START");
		
		MyThread4 t0 = new MyThread4();
		t0.start();
		
		MyThread4 t1 = new MyThread4();
		t1.start();
		
		System.out.println("Driver2.main() END");
	}
}
