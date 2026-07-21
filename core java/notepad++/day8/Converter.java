Class Converter
{
	public static void main(String args[])
	{
		Converter convert = new Converter();
		
		double output =  convert.toMeter(1500);
		
		System.out.println("Your value in Km is:" + output);
		
	}
	
	double toMeter(double value)
	{
		double km = value / 1000;
		return km;
	}
}