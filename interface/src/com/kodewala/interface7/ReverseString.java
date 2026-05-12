package com.kodewala.interface7;

interface IReverse {
	String reverse(String str);
}


public class ReverseString {
	public static void main(String[] args) {
		
		IReverse reverse = (str) -> 
		{
			String rev = "";
			
			for(int i = str.length()-1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			return rev;
		};
		
		System.out.println(reverse.reverse("kodewala"));
	}
}
