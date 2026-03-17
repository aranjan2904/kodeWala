class Account
{
	static int debit = 100;
	static int balance;
	static String branch;
	
	public static void main(String args[])
	{
		balance = 5000;
		balance = balance + 500;
		String name = "Abhishek";
		branch = "ADB";
		System.out.println("The Account Holder "+name+ " balance is = "+balance+ " "+ branch + " " + debit);
	}
}