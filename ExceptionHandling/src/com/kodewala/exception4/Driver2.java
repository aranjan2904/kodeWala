package com.kodewala.exception4;





public class Driver2 {

	public static void main(String[] args) {

		UserRegistration user = new UserRegistration();

		try {

			user.register("5465654654");

		} 
		catch (PhoneNumberExistException e) {

			e.printStackTrace();
			System.out.println("phone already exist");
		}
	}
}