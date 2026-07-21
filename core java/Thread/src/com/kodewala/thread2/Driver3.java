package com.kodewala.thread2;

class PrintNumber implements Runnable {
	
	@Override
	public void run() { //RUNNING
		
		for(int i=0; i<= 10; i++) {
			System.out.println("Number is: " + i);
			
			if(i == 4) {
				System.out.println("sending " + Thread.currentThread().getName() + " to sleep");
				
				try {
					Thread.currentThread().sleep(10000); // here thread is sleep for 10sec, after 10sec it will go to RUNNABLE state, then when cpu gives time it will be in RUNNING state and execute rest code.
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("sleep time over... starting executing again...");
			}
		}
	}
}

public class Driver3 {
	public static void main(String[] args) {
		PrintNumber printNum = new PrintNumber();
		//printNum.run(); // if
		
		Thread t1 = new Thread(printNum); // NEW BORN
		t1.start(); // RUNNABLE
		
		
	}
}
