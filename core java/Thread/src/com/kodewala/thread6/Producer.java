package com.kodewala.thread6;

public class Producer implements Runnable{

	Task task;
	
	public Producer(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<= 10; i++) {
			try {
				task.produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
