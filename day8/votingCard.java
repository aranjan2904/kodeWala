class VotingCard
{
	public static void main(String args[]){
		String input = args[0];
		int applicantAge = Integer.parseInt(input);
		
		System.out.println("Age must be between 18 - 100");
		System.out.println("Age of the Applicant is: "+applicantAge);
		
		int minAge = 18;
		int maxAge = 100;
		
		System.out.println("Is Applicant eligible for voter card:");
		
		System.out.println(minAge <applicantAge && maxAge > applicantAge);
	}
}