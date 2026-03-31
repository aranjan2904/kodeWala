package com.test;
import com.college.College;

class Test
{
	public static void main(String args[])
	{
		College college = new College();
		//System.out.println(college.stdName); private
		//System.out.println(college.rollNo);  default
		System.out.println(college.collegeName); // public
	}
}