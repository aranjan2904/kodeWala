package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver8 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "kodewala";
			return name;
		}).thenApply((a) -> a.toUpperCase());
		
		System.out.println(cf.join());
	}
}
