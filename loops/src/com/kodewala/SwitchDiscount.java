package com.kodewala;

public class SwitchDiscount {
	 void calculateDiscount(int discount) {
			System.out.println("Customer will get "+ discount + "%");
		}

		
		void discount()
		{
	String customerMembershipPlan = "Diamond";
			
			switch (customerMembershipPlan) {
			case "Silver":
				calculateDiscount(10);
				break;
			case "Gold":
				calculateDiscount(30);
				break;
			case "Diamond":
				calculateDiscount(50);
				break;
			default:
				System.out.println("No discount, please activate your Membership plan");
				break;
			}
			
		}
		public static void main(String[] args) {
			SwitchDiscount switchDiscount = new SwitchDiscount();
			switchDiscount.discount();
			
		}
}
