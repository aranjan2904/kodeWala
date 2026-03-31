 class Converter
{
	public static void main(String args[])
	{
		String input = args[0];
		double inputValue = Integer.parseInt(input);
		//Converter convert = new Converter();
		
		double output =  Converter.toKm(inputValue);
		
		System.out.println("Your value in Km is:" + output);
		
	}
	
	 static double toKm(double value)
	{
		double km = value / 1000;
		return km;
	}
}