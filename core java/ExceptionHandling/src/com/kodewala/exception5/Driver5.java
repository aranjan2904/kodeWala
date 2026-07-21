package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver5 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("src/com/kodewala/exception5/sample.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {

				if (line.contains("Java")) {

					System.out.println(line);
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}