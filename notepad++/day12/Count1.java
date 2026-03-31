package com.kodewala;
class Count1
{
	public static void main(String args[]){
		Count1 count = new Count1();
		count.task();
	}
	
	public void task(){
		for(int i=1;  i<=50; i++){
			System.out.println("Lets count: "+i);
		}
	}
}