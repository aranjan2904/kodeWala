package com.kodewala.thread8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Working " + Thread.currentThread().getName());
	}

}

public class Driver2 {
	public static void main(String[] args) {

		Task1 task = new Task1();

		ExecutorService exeService = Executors.newSingleThreadExecutor();


		for (int i = 0; i < 150; i++) {

			exeService.execute(task);
		}
		// exeService.submit(); //submit is available for runnable and callable both. 
		
		exeService.shutdown();
	}
}
