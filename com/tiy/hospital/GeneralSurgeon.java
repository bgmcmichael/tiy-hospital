package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class GeneralSurgeon extends Doctor implements canGiveTreatment, canChooseTreatment{

    public GeneralSurgeon(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "General Surgeon";
    }

    @Override
    public void chooseTreatment(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("1")){
            System.out.println("I do not believe this is a general medicine issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("2")){
            System.out.println("I do not believe this is a surgical issue.");
        }
        if (patientsDisease.equals(Disease.BROKEN_BONE)){
            System.out.println("I believe you have a broken bone, I have the surgery scheduled.");
            giveTreatment(aPatient);
        }
        if (patientsDisease.equals(Disease.HERNIA)){
            System.out.println("I believe you have a hernia, I have the surgery scheduled.");
            giveTreatment(aPatient);
        }
        if (patientsDisease.equals(Disease.SKIN_GROWTH)){
            System.out.println("I believe you have a skin growth, I have the surgery scheduled.");
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
