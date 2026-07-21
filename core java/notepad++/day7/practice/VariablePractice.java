class VariablePractice
{
	public static void main(String []args){
		int number = 5;
		int square = (number*number);
		System.out.println("The Square of " +number+" is = "+square);
	}
}

class Car 
{
	String brand;
	int price;
	
	public void display(){
		System.out.println("Brand = "+brand + "and Price is = "+price);
	}

	public static void main(String args[]){
		Car c1 = new Car();
		c1.brand = "Audi";
		c1.price = 12000;
		
		Car c2 = new Car();
		c2.brand = "Swift";
		c2.price = 500007;
		
		c1.display();
		c2.display();
		
	}
}

class College
{
	static String college = "R.C.I.T";
	String name = "Abhishek";
	
	public static void main(String []args){
		
	}
}

class GymMember
{
	static String gymName;
	String name;
	int weight;
	
	public static void main(String args[]){
		GymMember g1 = new GymMember();
		
		g1.gymName = "L7 fitness studio";
		g1.name = "Abhishek Ranjan";
		g1.weight = 35;
		
		System.out.println(gymName);
	}
}