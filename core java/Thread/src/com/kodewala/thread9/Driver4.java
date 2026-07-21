package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;

public class Driver4 {
	public static void main(String[] args) {
		
		 CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "kodewala";
			
			return name;
		}).thenAccept((a) -> System.out.println("Hello")); //Then Accept will not 
		
		System.out.println("Response: " + cf.join());
	}
}
