package com.kodewala.thread7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {  //Callable return Future Object and throws exception unlike Runnable.

	@Override
	public String call() {
		System.out.println(Thread.currentThread().getName());  //pool-1-thread-1
		return "Task failed....";
	}
}

public class DriverCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(3); //Executor is a framework that create, manage Thread and reuse it as required.
		Task task = new Task();
		
		for(int i=0; i<5; i++) {
			
		Future<String> response = es.submit(task); //This returns Future object  
		System.out.println(response.get());
		}
		es.shutdown(); //This will shut down the jvm.
	}
}
