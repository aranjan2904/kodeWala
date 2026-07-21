package com.kodewala.Polymorphism2;

public class LoginService {
	
	public boolean doLogin(String userId, String password) {
		
		connectDB();
		
		encryption();
		
		validate();
		
		return true;
	}
	
	private void connectDB() {
		System.out.println("connecting to database");
	}
	
	private void encryption() {
		System.out.println("encrypting the password");
	}
	
	private void validate() {
		System.out.println("validating user");
	}

}
