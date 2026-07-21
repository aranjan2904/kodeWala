package com.kodewala.interface1;

public class Hotstar implements IOTTFeaturesRules{
	
	@Override
	public void signUp() {
		System.out.println("signing up user");
	}

	@Override
	public void login() {
		System.out.println("logging user");
	}

	@Override
	public void cancelSubscription() {
		System.out.println("subscription canceled");
	}

	@Override
	public void purchaseMembership() {
		System.out.println("purchase your plans here");
	}

	@Override
	public void modifyMembership() {
		System.out.println("modify your membership plan here");

	}
}
