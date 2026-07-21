package com.kodewala;
class Count
{
	public static void main(String args[]){
		Count count = new Count();
		count.task();
	}
	
	public void task(){
		for(int i=1;  i<=50; i++){
			System.out.println("Lets count: "+i);
		}
	}
}