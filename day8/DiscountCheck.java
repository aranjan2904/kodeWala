class DiscountCheck
{
	public static void main(String args[])
	{
		String inputMember = args[0];
		String inputCartValue = args[1];
		
		int cartValue = Integer.parseInt(inputCartValue);
		
		
		int minCartValue = 1000;
		
		
		System.out.println(inputMember.equals("Gold") || cartValue >= minCartValue);
	}
}