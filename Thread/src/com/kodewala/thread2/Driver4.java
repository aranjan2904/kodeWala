package com.kodewala.thread2;

class Odd implements Runnable {

    public void run() {

        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {

                System.out.println("Number: " + i +
                        " is printed by: " +
                        Thread.currentThread().getName());

                count++;

                if (count == 10) {
                    try {
                        System.out.println(
                                Thread.currentThread().getName()
                                + " sleeping...");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Even implements Runnable {

    public void run() {

        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                System.out.println("Number: " + i +
                        " is printed by: " +
                        Thread.currentThread().getName());

                count++;

                if (count == 10) {
                    try {
                        System.out.println(
                                Thread.currentThread().getName()
                                + " sleeping...");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Driver4 {
	public static void main(String[] args) {

		Even even = new Even();
		Thread t1 = new Thread(even);

		Odd odd = new Odd();
		Thread t2 = new Thread(odd);

		t1.start();
		t2.start();

	}
}
