package com.kodewala.exception4;

public class UserRegistration {

	boolean userExist = true;

	public boolean register(String message) throws PhoneNumberExistException {

		if (userExist) {

			throw new PhoneNumberExistException("Phone number already exists");
		}

		return true;
	}
}

