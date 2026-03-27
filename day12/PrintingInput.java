package com.kodewala;

import java.util.Scanner;

class PrintingInput 
{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide your input...");
		String input = scanner.next();
		
		System.out.println("Entered input is: "+ input);
		
		scanner.close();
	}
}