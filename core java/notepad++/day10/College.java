package com.college;

public class College
{
	 private String stdName = "Abhishek";
	 int rollNo = 23;
	 protected int marks = 90;
	 public String collegeName = "R.C.I.T";
	
	public static void main(String args[])
	{
		College college = new College();
		
		System.out.println("Student name is: "+college.stdName);
		System.out.println(college.rollNo);
		System.out.println(college.marks);
		System.out.println(college.collegeName);
	}
}