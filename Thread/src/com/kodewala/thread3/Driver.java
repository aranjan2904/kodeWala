package com.kodewala.thread3;

class ClassMeeting extends Thread{
	
	@Override
	public void run() {
		System.out.println("host is joining... [" + Thread.currentThread().getName() + "]" );
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("host joined meeting. [" + Thread.currentThread().getName() + "]");
		
	}
}

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Class");
		System.out.println("class waiting for host...[" + Thread.currentThread().getName() + "]");
		
		ClassMeeting meetingThread = new ClassMeeting();
		meetingThread.setName("host");
		meetingThread.start();
		
		meetingThread.join(); //by default parameter is 0, means it will wait till meetingThread complete, when parameter given it will wait till parameter time and then continue executing.
		
		System.out.println("meeting started! [" + Thread.currentThread().getName() + "]");
	}
}
