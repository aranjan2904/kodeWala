package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;

public class Driver3 {
	public static void main(String[] args) {
		
		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";
			
			return name;
		}).thenApply((n) -> n.toUpperCase()); // thenApplyAsync will create another thread and run parallel, //thenApply will apply some operation on return 
		
		System.out.println("Response: " + cf.join());
	}
}
