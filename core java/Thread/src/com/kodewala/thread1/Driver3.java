package com.kodewala.thread1;

class MyThread6 extends Thread{
	
	@Override
	public void run() {
		School school = new School();
		school.schoolWork();
	}
}

public class Driver3 {
	public static void main(String[] args) {
		
		MyThread6 t6 = new MyThread6();
		t6.start();
	}
}
