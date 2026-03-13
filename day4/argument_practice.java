class StudentDetails 
{
	public static void main(String args[])
	{
		String Student_ID = args[0];
		String Name = args[1];
		String Course = args[2];
		String Age = args[3];
		String City = args[4];
		
		System.out.println("Student_ID = " + Student_ID);
		System.out.println("Name = " +Name);
		System.out.println("Course = " + Course);
		System.out.println("Age = " + Age);
		System.out.println("City = " + City);
	}
}


class EmployeeDetails 
{
	public static void main(String []args)
	{
		String employee_id = args[0];
		String employee_name = args[1];
		String department = args[2];
		String salary = args[3];
		
		System.out.println("Employee_ID = " + employee_id);
		System.out.println("Employee_Name = "+ employee_name);
		System.out.println("Department = "+ department);
		System.out.println("Salary = "+ salary);
	}
}


class MovieTicket
{
	public static void main(String []args)
	{
		String movie_name = args[0];
		String theatre = args[1];
		String ticket_price = args[2];
		String number_of_tickets = args[3];
		
		System.out.println("Movie Name = "+ movie_name);
		System.out.println("Theatre =" + theatre);
		System.out.println("Price = " + ticket_price);
		System.out.println("Number of ticket =" + number_of_tickets);
		
	}
}


class Course
{
	public static void main (String arg[])
	{
		String rollNo = arg[0];
		String name = arg[1];
		String course = arg[2];
		String city = arg[3];
		
		System.out.println("Roll No = " + rollNo);
		System.out.println("Name = " + name);
		System.out.println("Course = " + course);
		System.out.println("City = " + city);

	}
}


class Product_Billing
{
	public static void main(String args[])
	{
		String product_name = args[0];
		String price = args[1];
		String quantity = args[2];
		
		System.out.println("Product Name = " + product_name);
		System.out.println("Price = " + price);
		System.out.println("Quantity = " + quantity);
		
	    System.out.println("Total Price = " + (price + quantity) );
	}
}
