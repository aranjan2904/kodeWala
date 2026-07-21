package com.kodewala.interface4;

public class AIMS implements IHospitalSystem, IGlobalHospital {

    public static void main(String[] args) {
        AIMS obj = new AIMS();
        obj.patientHistoryDoc();
    }

    @Override
    public void patientHistoryDoc() {
        IGlobalHospital.super.patientHistoryDoc();
    }
}