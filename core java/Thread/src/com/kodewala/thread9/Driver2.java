package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Start " + Thread.currentThread().getName());
		
		//CompletableFuture is run parallel and not block the previous thread
		//supplyAsync method will return future object
		 CompletableFuture<String> response = CompletableFuture.supplyAsync(() -> {
			 return "Sucess";
		 });
		 
		 System.out.println("End " + Thread.currentThread().getName());
		 
		 System.out.println(response.get());
	}
}
