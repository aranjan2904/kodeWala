package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

public class OrderSystem {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("src/com/kodewala/exception5/data.txt"))) {

			String line;

			while ((line = br.readLine()) != null) {

				String arr[] = line.split(",");

				int orderId = Integer.parseInt(arr[0]);

				String customerName = arr[1];

				int amount = Integer.parseInt(arr[2]);

				Orders orders = new Orders(
						orderId,
						customerName,
						amount);

				orders.display();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}