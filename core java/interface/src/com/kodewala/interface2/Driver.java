package com.kodewala.interface2;

interface IBanking {
	// started in 2010 (1.6v)  --> 2012(wanted new feature "printPassBook")
	void pay();
	void settle();
	void cancel();
	default void printPassBook()// only for ruler Bank
	{
		 
	}

}


class HDFC implements IBanking{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	
}

class RulerBank implements IBanking {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Driver {
	public static void main(String[] args) {
		
	}
}
