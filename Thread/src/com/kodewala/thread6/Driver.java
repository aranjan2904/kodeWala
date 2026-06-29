package com.kodewala.thread6;

public class Driver {
	public static void main(String[] args) {
		
		Task task = new Task();
		
		Producer producer = new Producer(task);
		Consumer consumer = new Consumer(task);
		
		Thread t1 = new Thread(producer);
		t1.setName("producer");
		Thread t2 = new Thread(consumer);
		t2.setName("consumer");
		
		t1.start();
		t2.start();
	}
}
