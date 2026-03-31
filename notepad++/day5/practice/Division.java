class Division
{
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("Please provide 2 valid input");
			return;
		}
			int firstNumber = Integer.parseInt(args[0]);
			int secondNumber = Integer.parseInt(args[1]);
	    if(secondNumber == 0)
		{
			System.out.println("Number cannot be divisible by 0");
		}
		else
		{
			
			
			int divide = (firstNumber/secondNumber);
			
			System.out.println("Division of these numbers is: " + divide);
		}
	}	
}