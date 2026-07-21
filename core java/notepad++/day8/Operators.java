class Operators
{
	public static void main(String args[]){
		String input = args[0];
		int userInput = Integer.parseInt(input);
		System.out.println("User input is: "+userInput);
		
		System.out.println("For DL your minimum age must be 18 or above.");
		
		int minAge = 18;
		System.out.println(userInput >= minAge);
		
	}
}