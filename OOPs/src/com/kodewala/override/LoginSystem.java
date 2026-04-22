package com.kodewala.override;

class User {
	public User login(){
		System.out.println("User logged in");
		return new User();
	}
}

class Admin extends User{
	@Override
	public Admin login() {
		System.out.println("Admin logged in with Special privileges");
		return new Admin();
	}
}

public class LoginSystem {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.login();
	}
}
