class Swap
{
	public static void main(String args[])
	{
	    int number11 = Integer.parseInt(args[0]);
		int number22 = Integer.parseInt(args[1]);
		
		int temp = number11;
		number11 =number22;
		number22 = temp;
		
		
		System.out.println("swapted no. is " + number11 + " " + number22);
	}
}


class SwapWithNoVariable
{
	public static void main(String args[])
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		
		System.out.println("Swap no. is " + number1 + " " + number2);
	}
}