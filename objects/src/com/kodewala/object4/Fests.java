package com.kodewala.object4;

class StdRegister {
	public static int totalReg = 0;
	
	private String student;
	
	public StdRegister(String _student) {
		this.student = _student;
	}
	{
		totalReg = totalReg + 1;
	}
	
}

public class Fests {
	public static void main(String[] args) {
		StdRegister std = new StdRegister("abhishek");
		System.out.println(StdRegister.totalReg);
	}
}
