class OrderDetails
{
	public static void main(String args[])
	{
		String order_Id = args[0];
		String Item_Name = args[1];
		String Price = args[2];
		String Qty = args[3];
		String State = args[4];
		String Delivery_Address = args[5];
		
		System.out.println("order_Id = "+order_Id);
		System.out.println("Item_Name = " + Item_Name);
		System.out.println("Price = " + Price);
		System.out.println("Qty = " + Qty);
		System.out.println("State = " +State );
		System.out.println("Delivery_Address =" + Delivery_Address);
	}
}