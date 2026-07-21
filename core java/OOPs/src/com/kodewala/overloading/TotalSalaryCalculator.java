package com.kodewala.overloading;

class TotalSalary {
	
	public double calculateSalary(double baseSalary) {
		//System.out.println("Your Total Salary is: " + baseSalary);
		return baseSalary;
	}
	
	public double calculateSalary(double baseSalary, double bonus) {
		//System.out.println("Your Total Salary is: " + (baseSalary + bonus) );
		double total = baseSalary + bonus;
		return total;
	}
	
	public double calculateSalary(double baseSalary, double bonus, double incentives) {
		//System.out.println("Your Total Salary is: " + (baseSalary + bonus + incentives));
		double total = baseSalary + bonus + incentives;
		return total;
	}
	
	public void display(double total) {
		System.out.println("Your total Salary is: " + total);
	}
	
}

public class TotalSalaryCalculator {
	public static void main(String[] args) {
		
		TotalSalary totalSalary = new TotalSalary();
		totalSalary.display(totalSalary.calculateSalary(45000,5000));
		
		;
		
	}
}
