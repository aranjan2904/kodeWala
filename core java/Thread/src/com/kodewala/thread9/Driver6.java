package com.kodewala.thread9;

import java.util.concurrent.CompletableFuture;

public class Driver6 {
	public static void main(String[] args) {
		CompletableFuture.runAsync(() -> {
			System.out.println("completable run,,,");
		});
	}
}
