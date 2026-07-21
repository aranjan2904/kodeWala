package com.kodewala.practice;

public class Demo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(6, "kodewala");
		//sb.append(" kodewala");
		sb.reverse();
		System.out.println(sb);
		
	}
}
