package com.kodewala.objects;


class Details
	{
		int studentID;
		String studentName;
		int studentRollNo;
		
		public Details(int id, String name, int rollNo)
		{
			System.out.println("constructor started");
			this.studentID = id;
			this.studentName = name;
			this.studentRollNo = rollNo;
		}
	}
    

public class StudentDetails {
	public static void main(String[] args) {
		System.out.println("main method started");
		Details stdDetail = new Details(34534,"abhishek",34);
		System.out.println(stdDetail.studentID);
		System.out.println(stdDetail.studentName);
		System.out.println("main method closed");

		
	}
}
