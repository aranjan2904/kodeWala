package com.kodewala.thread61;

public class Consumer extends Thread{
	Task task;
	
	public Consumer(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		for(int i=0; i<= 10; i++) {
			task.consume();
		}
	}
}
