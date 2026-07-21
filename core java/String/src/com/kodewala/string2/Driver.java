package com.kodewala.string2;

 class Account{
	
}

public class Driver extends Account { // class declared as final cannot be parent of other class
	public static void main(String[] args) {
		String a1 = "Abhishek";
		String a2 = " Ranjan";
		
		String a3 = a1 + a2; // this will create obj in heap only
		System.out.println(a3);
		
		String a4 = a3.intern(); //this will create a copy in scp and a3 will start pointing in scp
		System.out.println(a3 == a4);
	}
}
