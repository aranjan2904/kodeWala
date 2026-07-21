package com.kodewala.interface4;

 public interface IGlobalHospital {
    default void patientHistoryDoc() {
        System.out.println("IGlobalHospital.patientHistoryDoc()");
    }
}
