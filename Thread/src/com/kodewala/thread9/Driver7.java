package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver7 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> response = CompletableFuture.supplyAsync(() -> {
			return "Done";
		});
		
		System.out.println(response.get());
	}
}
