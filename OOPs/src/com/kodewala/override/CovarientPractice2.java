package com.kodewala.override;

class Employee1 {

	public CommonSms salaryCreditSms() {
		System.out.println("Salary credited to Employee");
		return new CommonSms("abhishek");
	}
}

class Manager1 extends Employee1{
	
    @Override
	public SpecificSms salaryCreditSms() {
		System.out.println("Salary credited to Manager");
		return new SpecificSms("Abhishek", 25);
	}
}

public class CovarientPractice2 {
	public static void main(String[] args) {
		Manager1 manager1 = new Manager1();
		manager1.salaryCreditSms();
	}
}
