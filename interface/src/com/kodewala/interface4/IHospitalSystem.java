package com.kodewala.interface4;

public interface IHospitalSystem {
    default void patientHistoryDoc() {
        System.out.println("IHospitalSystem.patientHistoryDoc()");
    }
}