package com.kodewala.inheritance;

class University {
	private String UniversityName;

	public University() {
		this.UniversityName = "Unknown University";
	}

	public University(String universityName) {
		setUniversityName(universityName);
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

}

class Subject extends University {
	private String subject;
	
	public Subject() {
		this.subject = "Unknown Subject";
	}

	public Subject(String universityName, String subject) {
		super(universityName);
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}

public class UniversitySystem {
	public static void main(String[] args) {
		Subject subject1 = new Subject();
		Subject subject2 = new Subject("Rcit", "cse");
		
		System.out.println(subject1.getSubject() + " " + subject1.getUniversityName() );
		System.out.println(subject2.getSubject() + " " + subject2.getUniversityName());
	}
}
