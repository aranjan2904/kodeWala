package com.kodewala.thread8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Working " + Thread.currentThread().getName());
	}

}

public class Driver {
	public static void main(String[] args) {

		Task task = new Task();

		// ExecutorService exeService = Executors.newSingleThreadExecutor(); //This is
		// create only one thread and reuse it.

		// ExecutorService exeService = Executors.newCachedThreadPool(); // Number of
		// thread created is decided by executor framework.

		// executor framework comes in java 1.5v
		ExecutorService exeService = Executors.newFixedThreadPool(50); // Number of fixed thread developer can pass, and
																		// will created by executor framework.

		for (int i = 0; i < 150; i++) {

			exeService.execute(task);
		}
		// exeService.submit(); //submit is available for runnable and callable both. 
		
		exeService.shutdown();
	}
}
