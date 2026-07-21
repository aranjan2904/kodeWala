package com.kodewala.interface6;

class BloodReport implements ReportPrintable{
	int reportNumber;
	String status;
	String findings;
	
	public BloodReport(int reportNumber, String status, String findings) {
		this.reportNumber = reportNumber;
		this.status = status;
		this.findings = findings;
	}
}


class ReportProcess {
	public void printReport(Object obj) {
		
		if(obj instanceof ReportPrintable) {
			
			BloodReport bloodReport = (BloodReport) obj;
			System.out.println(bloodReport.reportNumber);
			System.out.println(bloodReport.status);
			System.out.println(bloodReport.findings);
		}else {
			System.out.println("Report Data is not Printable");
		}
		
	}
}

public class Driver {
	public static void main(String[] args) {
		
		BloodReport bloodReport = new BloodReport(561, "done", "Negative");
		
		ReportProcess reportProcess = new ReportProcess();
		reportProcess.printReport(bloodReport);
	}
}
	