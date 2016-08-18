package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class CardiacSurgeon extends Doctor implements canChooseTreatment, canGiveTreatment {

    public CardiacSurgeon(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "Cardiac Surgeon";
    }

    @Override
    public void chooseTreatment(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("3")){
            System.out.println("I do not believe this is a cardiac issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("2")){
            System.out.println("I do not believe this is a surgical issue.");
        }
        if (patientsDisease.equals(Disease.CLOGGED_ARTERY)){
            System.out.println("I believe you have a clogged artery, I have the surgery scheduled.");
            giveTreatment(aPatient);
        }
        if (patientsDisease.equals(Disease.ARRHYTHMIA)){
            System.out.println("I believe you have an arrhythmia, I have the surgery scheduled.");
            giveTreatment(aPatient);
        }
        if (patientsDisease.equals(Disease.ANEURISM)) {
            System.out.println("I believe you have an aneurism, I have the surgery scheduled.");
            giveTreatment(aPatient);
        }
    }

    @Override
    public void giveTreatment(Patient aPatient) {
        if (Math.random() >= .5) {
            aPatient.setIsSick(false);
            System.out.println("The surgery was a success! " + aPatient.getFullName() + " may check out of the hospital.");
        } else {
            aPatient.setIsSick(true);
            System.out.println("There were complications with the surgery, we will need to schedule another when you are more stable");
        }
    }

    @Override
    public void diagnosePatient(Patient aPatient) {}
}
