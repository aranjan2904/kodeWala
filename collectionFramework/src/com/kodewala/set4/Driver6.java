package com.kodewala.set4;

import java.util.*;


class Student5 implements Comparable<Student5>{
	Integer id;
	String name;
	
	public Student5(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	@Override
//	public int compareTo(Student5 o) {
//		return (this.id.compareTo(o.id));
//	}
	
	@Override
	public int compareTo(Student5 o) {
		return (this.id - o.id);
	}
	
}

public class Driver6 {
	public static void main(String[] args) {
		
		Student5 std5 = new Student5(5, "abhishek");
		Student5 std6 = new Student5(6, "abhishek");
		Student5 std7 = new Student5(7, "abhishek");
		
		Student5 std1 = new Student5(1, "abhishek");
		Student5 std2 = new Student5(2, "abhishek");
		Student5 std3 = new Student5(3, "abhishek");
		Student5 std4 = new Student5(4, "abhishek");
		
		Set<Student5> treeSet = new TreeSet<>();
		
		treeSet.add(std4);
		treeSet.add(std5);
		treeSet.add(std6);
		treeSet.add(std7);
		treeSet.add(std1);
		treeSet.add(std2);
		treeSet.add(std3);
		
		
		for(Student5 s : treeSet) {
			System.out.println(s.id);
		}
		
		
	}
}
