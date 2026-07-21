package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author aranj
 */

public class Driver {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader(""));)
		{
			String line;
			while((line = br.readLine()) != null) 
			{
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
