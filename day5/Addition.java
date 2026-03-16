class Addition 
{
	public static void main(String args[])
	{
		if (args.length == 2)
		{
		    int firstNumber = Integer.parseInt(args[0]);
			int secondNumber = Integer.parseInt(args[1]);
		
			System.out.println("Addition of these two numbers are = " +(firstNumber+secondNumber));
		}
		else
		{
			System.out.println("Please provide 2 valid input");
		}
		
	}
}