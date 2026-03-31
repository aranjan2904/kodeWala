class Subtraction
{
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("Please provide valid 2 input");
			return;
		}
		{
			int firstNumber = Integer.parseInt(args[0]);
			int secondNumber = Integer.parseInt(args[1]);
			
			int difference = (firstNumber - secondNumber);
			
			System.out.println("The difference of these numbers are: "+ difference);
		}
	}
}