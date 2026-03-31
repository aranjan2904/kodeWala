package com.kodewala.loopsPractice;

public class EvenOddSkipProgram {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if(i%3 == 0)
			{
				continue;
			}
			if (i%2 == 0) {
				System.out.println(i+ " This is even number");
			} else {
				System.out.println(i +" This is odd number");
			}
		}
	}
}
