package com.kodewala.thread61;

public class Driver {
	public static void main(String[] args) {
		
		Task task = new Task();
		
		Producer p = new Producer(task);
		
		Consumer c = new Consumer(task);
		
		p.start();
		c.start();
	}
}
