class Amstrong 
{
	public static void main(String args[])
	{
		int sum = 0;
		int number = 156;
		int original = number;
		while(number !=0){
			int lastDigit = number % 10;
			
			sum = sum + lastDigit* lastDigit * lastDigit;
			number = number/ 10;
		}
		if(original == sum){
			System.out.println("yes");
		}else{
			System.out.println("not");

		}
	}
}