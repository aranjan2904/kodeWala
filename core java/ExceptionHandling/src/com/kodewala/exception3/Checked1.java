package com.kodewala.exception3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked1 {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\aranj\\Desktop\\kodewala\\ExceptionHandling\\src\\com\\kodewala\\exception3\\abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}
}

