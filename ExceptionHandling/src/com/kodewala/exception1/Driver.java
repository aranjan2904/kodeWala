package com.kodewala.exception1;

class OrderMedicine {
    String patientName;
    String medicineName;
    String prescription;

    public OrderMedicine(String patientName, String medicineName, String prescription) {
        super();
        this.patientName = patientName;
        this.medicineName = medicineName;
        this.prescription = prescription;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getPrescription() {
        return prescription;
    }
}

class ProcessOrder {

    public void process() {

        try {
            OrderMedicine order = new OrderMedicine("Abhishek", "tofacitinib", null);

            System.out.println("Patient Name: " + order.getPatientName());

            System.out.println("Medicine Name: " + order.getMedicineName());

            System.out.println("Prescription: " + order.getPrescription().length());

        } catch (NullPointerException e) {

            e.printStackTrace();

            System.out.println("Prescription not uploaded...");
        }
    }
}

public class Driver {

    public static void main(String[] args) {

        ProcessOrder processOrder = new ProcessOrder();

        processOrder.process();
    }
}