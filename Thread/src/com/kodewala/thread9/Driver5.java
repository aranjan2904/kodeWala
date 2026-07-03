package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

		//thenCombine will combine the both and do operation.
		CompletableFuture<Integer> finalfuture = future1.thenCombine(future2, (n1, n2) -> n1 + n2);
		
		CompletableFuture.allOf(future1,future2);
		System.out.println(finalfuture.get());
	}
}
