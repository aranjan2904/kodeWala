package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderApp {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\aranj\\Desktop\\kodewala\\ExceptionHandling\\src\\com\\kodewala\\exception5\\text.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}