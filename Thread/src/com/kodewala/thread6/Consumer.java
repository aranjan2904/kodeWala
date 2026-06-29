package com.kodewala.thread6;

public class Consumer implements Runnable{
	Task task;
	
	public Consumer(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		
		for(int i=0; i<=10; i++) {
			try {
				task.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
