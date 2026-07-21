package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Driver3 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 12, 45, 76, 34, 89, 12, 34, 55, 9, 76, 5, 7, 98, 545, 32);

		numbers.stream().filter(w -> w % 2 == 0).forEach(e -> System.out.println(e));

	}
}