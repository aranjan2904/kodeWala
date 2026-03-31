package com.kodewala;

public class ReturnBreakPractice {
	public static void main(String[] args) {
		String cities[] = {"Chennai", "Bangalore", "Delhi", "Ahmedabad","Jaipur"};
		
		
		for(int i=0; i<(cities.length); i++) {
			String currentCity = cities[i];
			if(currentCity == null)
			{
				System.out.println("null city found");
				return;
			}
			if (currentCity.equalsIgnoreCase("Bangalore")) {
				System.out.println(currentCity);
				System.out.println("You found it on index: ");
				break;
			}
		}
	}
}
