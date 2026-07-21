class CtoF
{
	public static void main(String args[])
	{
		int cel = Integer.parseInt(args[0]);
		
		int fah =(int)( (9.0/5)* cel + 32);
		
		System.out.println(fah);
	}
}

class MtoKm
{
	public static void main(String args[])
	{
		int meter = Integer.parseInt(args[0]);
		double km = (meter/1000);
		System.out.println(km);
	}
}

class Asci
{
	public static void main(String args[])
	{
		char character = args[0].charAt(0);
		int asci = (int)character;
		System.out.println(asci);
	}
	
}