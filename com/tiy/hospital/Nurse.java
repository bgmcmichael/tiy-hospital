package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class Nurse implements canGiveTreatment{
    private String treatment = "";
    Patient aPatient;

    public Nurse(String treatment, Patient aPatient) {
        this.treatment = treatment;
        this.aPatient = aPatient;
    }

    @Override
    public void giveTreatment(Patient aPatient) {
        if (Math.random() >= .5) {
            aPatient.setIsSick(false);
            System.out.println("The treatment was a success! " + aPatient.getFullName() + " may check out of the hospital.");
        } else {
            aPatient.setIsSick(true);
            System.out.println("There were complications with the treatment, when you are more stable try again.");
        }
    }
}
