package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Start " + Thread.currentThread().getName());
		
		//CompletableFuture will not block the previous thead 
		//runAsync will not return anything
		CompletableFuture.runAsync(() -> {
			System.out.println("Run Async ");
		});
		
		System.out.println("End " + Thread.currentThread().getName());
	}
}
