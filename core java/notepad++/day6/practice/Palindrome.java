class Palindrome
{
	public static void main(String args[])
	{
		int number = 9857;
		int orignal = number;
		
		int sum = 0;
		while(number !=0){
			int lastDigit = number % 10;
			sum = sum *10 + lastDigit;
			
			number = number/10;
		}
		if(orignal == sum){
			System.out.println("Yes! This is palindrome number");
		}else{
			System.out.println("No! This is not palindrome number");
		}
	}
}