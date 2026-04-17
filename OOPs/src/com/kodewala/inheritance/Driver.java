package com.kodewala.inheritance;


class AccountMgmt {   // Parent of Account class

    String ifscCode = "SBIN00001";

    public void doFundTransfer() {
        System.out.println("AccountMgmt.doFundTransfer().. 500 lines");
    }
}

class Account extends AccountMgmt {   // Account class is Child of AccountMgmt

    public void pay() {
        Account account = new Account();

        System.out.println(account.ifscCode);

        account.doFundTransfer();
    }
}

public class Driver {
	public static void main(String[] args) {
		
	}
   
}
