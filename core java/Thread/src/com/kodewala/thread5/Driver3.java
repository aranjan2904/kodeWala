package com.kodewala.thread5;

import java.util.concurrent.locks.ReentrantLock;

class Test {
	ReentrantLock lock = new ReentrantLock();
	
	void first() {
		lock.lock();
		
		try {
			System.out.println("First");
			second();
		}finally {
			lock.unlock();
		}
	}
	
	void second() {
		lock.lock();
		try {
			System.out.println("second");
			
		}finally {
			lock.unlock();
		}
	}
}

public class Driver3 {
	public static void main(String[] args) {
		Test test = new Test();
		
		test.first();
	}
}
