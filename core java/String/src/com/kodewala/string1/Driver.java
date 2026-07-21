package com.kodewala.string1;

public class Driver {
	public static void main(String[] args) {
		String jh1 = "Jharkhand";
		
		String jh2 = new String("Jharkhand");
		
		System.out.println(jh1 == jh2);
		System.out.println(jh1.equals(jh2));
		
		String jh3 = jh1.concat(" Daltonganj"); //this will create new object concatenating jh1 and its content and store in heap area.
		System.out.println(jh1);
		System.out.println(jh3);
		
		String jh4 = "Jharkhand Daltonganj"; //obj "Jharkhand Daltonganj is created in scp"
		System.out.println(jh3 == jh4); //false means object created in heap not in scp
		
		String jh10 = "Jharkhand" + " Palamu" + " Daltonganj"; // this will create in scp area
		String jh11 = "Jharkhand Palamu Daltonganj";
		System.out.println(jh10==jh11); //true
		
		String jh12 = new String("Jharkhand Palamu Daltonganj"); // this will create in heap area
		System.out.println(jh10 == jh12); // false 
		
		
	}
}

