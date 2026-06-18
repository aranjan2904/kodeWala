package com.kodewala.set4;

import java.util.*;



class Student6{
	int id;
	String name;
	
	public Student6(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Comparator1  implements Comparator<Student6>{
	
	@Override
	public int compare(Student6 o1, Student6 o2) {
		return (o1.id - o2.id);
	}
}

public class Driver8 {
	public static void main(String[] args) {
		
		Set<Student6> stdSet = new TreeSet<Student6>(new Comparator1());
		
		stdSet.add(new Student6(1, "abhishek"));
		stdSet.add(new Student6(2, "abhishek"));
		stdSet.add(new Student6(3, "abhishek"));
		stdSet.add(new Student6(4, "abhishek"));
		stdSet.add(new Student6(8, "abhishek"));
		stdSet.add(new Student6(2, "abhishek"));
		stdSet.add(new Student6(9, "abhishek"));
		
		
		for(Student6 s : stdSet) {
			System.out.println(s.id);
		}
	}
}
