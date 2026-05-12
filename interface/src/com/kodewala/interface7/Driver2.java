package com.kodewala.interface7;



public class Driver2 {
	public static void main(String[] args) {
		ISquare square = (a) -> 
		{
			if(a % 2 == 0) {
				 return a *a;
			}else {
				
				return 0;
			}
		};
		
		int result = square.calcSquare(6);
	}
}
