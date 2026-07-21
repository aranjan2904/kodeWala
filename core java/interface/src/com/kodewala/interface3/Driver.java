package com.kodewala.interface3;

interface Hospital {
	
    void admitPatient();
    
    void dischargePatient();
    
    void provideTreatment();
    
    void generateBill();

    static void printBill() {
        System.out.println("Printing hospital bill...");
    }
}

class Apollo implements Hospital {

    @Override
    public void admitPatient() {
        System.out.println("Admitting patient in Apollo Hospital");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Discharging patient");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Providing advanced treatment");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill");
        Hospital.printBill();
    }
}

class KIMS implements Hospital {

    @Override
    public void admitPatient() {
        System.out.println("Admitting patient");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Discharging patient");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Providing treatment");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill");
        Hospital.printBill();
    }
}

public class Driver {
	public static void main(String[] args) {
		
	}
}
