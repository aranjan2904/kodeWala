package com.kodewala.string1;

public class Demo {
	public static void main(String[] args) {
		String s1 = "daltonganj"; //stored in string constant pool
		String s2 = "Daltonganj";
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s1 == s2);
		
		String s3 = new String("Daltonganj"); //creating String object and "Daltonganj" literals store in SCP
		//above line can be written as
		//Strin
		System.out.println(s3 == s2); //compare the s3 and s2 address
		System.out.println(s3.equals(s2));//compare the content of s2 and s3 object address
		
		String s4 = new String ("daltonganj");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
}

