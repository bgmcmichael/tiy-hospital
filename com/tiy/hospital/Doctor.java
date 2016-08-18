package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public abstract class Doctor extends Person {
    public static final int kindsOfDoctor = 6;
    public String typeOfDoctor = "Doctor";

    public Doctor(String firstName, String lastName) {
        super (firstName, lastName);
    }


    public void callNurse(String treatment, Patient aPatient) {
        Nurse newNurse = new Nurse(treatment, aPatient);
        newNurse.giveTreatment(aPatient);
    }

    public abstract void diagnosePatient(Patient aPatient);
}
