package com.kodewala.thread61;

public class Task {

    boolean isAvailable = false;
    int number;

    public synchronized void produce(int value) {

        while (isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        number = value;
        System.out.println("Produced : " + number);

        isAvailable = true;

        notify();
    }
    
    public synchronized void consume() {
    	
    	while(!isAvailable) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
    	}
    	System.out.println("Consumed: "+ number);
    	isAvailable = false;
    	notify();
    }
}