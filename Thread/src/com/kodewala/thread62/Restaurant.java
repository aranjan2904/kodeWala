package com.kodewala.thread62;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
	
	private Queue<String> orders = new LinkedList<>();
	private final int capacity = 3;
	
	public synchronized void placeOrder(String order) {
		
		while(orders.size() == capacity) {
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		orders.add(order);
		System.out.println("Customer placed :" + order);
		
		notifyAll();
		
	}
	
	public synchronized void prepareOrder() {
		
		while(orders.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String order = orders.remove();
		
		System.out.println("chef prepared : " + order);
		
		notifyAll();
	}
}
