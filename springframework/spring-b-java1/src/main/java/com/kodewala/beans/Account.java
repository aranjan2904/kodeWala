package com.kodewala.beans;

public class Account {

	private String accountHolderName;
	private int ifsc;
	private String accountNumber;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolderName, int ifsc, String accountNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.ifsc = ifsc;
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", ifsc=" + ifsc + ", accountNumber=" + accountNumber
				+ "]";
	}
	
	
	
}
