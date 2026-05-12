package com.kodewala.exception3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) {
		FileRead fileRead = new FileRead();
		fileRead.readFile();
	}
}

class FileRead {
	public void readFile() {
		String fileName = "C:\\Users\\aranj\\Desktop\\kodewala\\ExceptionHandling\\src\\com\\kodewala\\exception3\\Sales_data.txt";

		try {

			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));

			String line;

			while ((line = br.readLine()) != null) {
				String lineArr[] = line.split(",");
				String city = lineArr[1];

				if (city.equals("Mumbai")) {
					System.out.println(line);
				}
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
