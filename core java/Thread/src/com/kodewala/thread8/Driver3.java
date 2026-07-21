package com.kodewala.thread8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Work implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("START");
		Thread.sleep(3000);
		System.out.println("END");
		return "SUCESS";
	}
	
}

public class Driver3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Work work = new Work();
		
		ExecutorService exeService = Executors.newCachedThreadPool();
		
		Future<String> response =  exeService.submit(work);
		System.out.println(response.get());
		System.out.println("Got response");
	}
}
