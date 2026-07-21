package com.kodewala.interface7;

interface Length {
	int calLength(String word);
}

public class LengthCal {
	public static void main(String[] args) {
		
		Length length = (word) -> 
		{
			  int  totalLength = word.length();
			  
			  return totalLength;
		};
		
		System.out.println(length.calLength("kodewala"));
	}

}


