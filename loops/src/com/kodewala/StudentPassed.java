package com.kodewala;

public class StudentPassed {
	public static void main(String[] args) {
		String studentNameArr[] = {"Amit", "Riya", "John", "Neha", "Rahul",
	            "Priya", "Karan", "Sneha", "Arjun", "Pooja"};
		
		int studentMarksArr[] = {78, 45, 90, 32, 67,
	            49, 88, 25, 55, 60};
		System.out.println("Passed Student are: ");
		for(int index=0; index < studentNameArr.length; index++)
		{
			if(studentMarksArr[index] < 50)
			{
				continue;
			}
			switch(studentMarksArr[index]/10)
			{
			case 9:
				System.out.println("Grade A");
				break;
				
			case 8:
				System.out.println("Grade B");
			    break;
			    
			case 7:
				System.out.println("Grade C");
				break;
			case 6:
				System.out.println("Grade D");
				break;
				
			}
			System.out.println(studentNameArr[index]+ " " + studentMarksArr[index]);
		}
	}
}
