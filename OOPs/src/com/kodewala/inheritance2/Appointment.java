package com.kodewala.inheritance2;

public class Appointment {
	String patientName = "Abhishek";
	String doctorName = "Lalit Dugal";
	String appointmentId = "45322";
	
	
	
	public void sendEmail(String appointmentId, String patientName,String doctorName) {
		System.out.println("Email sent");
	}
	
	public void sendSms(String mobile, String message) {
		System.out.println("sms sent");
	}
	
}

class Reminder extends Appointment {
	String date = "12 Dec 2026";

	public void sendReminder() {
		System.out.println("Patient: " + patientName);
		System.out.println("Doctor: " + doctorName);
		System.out.println("Appointment ID: " + appointmentId);
		System.out.println("Date: " + date);

		
		sendEmail(appointmentId, patientName, doctorName);
		
		sendSms("9876543210", "Your appointment reminder");
	}
}


