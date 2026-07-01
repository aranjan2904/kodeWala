package com.kodewala.thread7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Work implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		return "Working " + Thread.currentThread().getName();
	}
	
}

public class Driver2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 ExecutorService es = Executors.newFixedThreadPool(4);
		 
		 Work work = new Work();
		 
		 Future<String> response =  es.submit(work);
		 
		 System.out.println(response.get());
		 
		 es.shutdown();
	}
}
