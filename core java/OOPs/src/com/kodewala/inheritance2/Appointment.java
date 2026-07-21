package com.kodewala.inheritance2;

public class Appointment {
	private String patientName;
	private String doctorName;
	private String appointmentId;
	
	//constructor
	public Appointment(String patientName, String doctorName, String appointmentId) {
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.appointmentId = appointmentId;
	}
	
	//getter
	public String getPatientName() {
		return patientName;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}
	
	
	//separate email service
	
	public void sendEmail(String appointmentId, String patientName,String doctorName) {
		System.out.println("Email sent");
	}
	
	public void sendSms(String mobile, String message) {
		System.out.println("sms sent");
	}
	
}

class Reminder extends Appointment {
	private String date;
	private String patientMobile;
	
	public Reminder(String patientName, String doctorName, String appointmentId, String date, String patientMobile) {
		super(patientName, doctorName, appointmentId);
		this.date = date;
		this.patientMobile = patientMobile;
	}

	public void sendReminder() {
		System.out.println("=== Appointment Reminder ===");
		System.out.println("Patient: " + getPatientName());
		System.out.println("Doctor: " + getDoctorName());
		System.out.println("Appointment ID: " + getAppointmentId());
		System.out.println("Date: " + date);

		
		sendEmail(getAppointmentId(),getDoctorName(),getDoctorName());
		
		sendSms(patientMobile, "your appintment is on "+ date);
	}
}


