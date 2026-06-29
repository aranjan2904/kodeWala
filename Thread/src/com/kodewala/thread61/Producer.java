package com.kodewala.thread61;

public class Producer extends Thread{
	Task task;
	
	public Producer(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			try {
				task.produce(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
