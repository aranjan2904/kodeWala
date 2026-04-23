package com.kodewala.inheritance2;

public class HospitalMangement {
	public static void main(String[] args) {
		Reminder reminder = new Reminder(
			    "Abhishek Ranjan",
			    "Lalit Duggal",
			    "APT101",
			    "26 March",
			    "84487594847"
			);
		reminder.sendReminder();
		
		reminder.sendEmail("34322", "Abhishek Ranjan", "Lalit dugal");
		
		reminder.sendSms("84487594847", "Your Appointment with doctor dugal is sheduled");
	}
}
