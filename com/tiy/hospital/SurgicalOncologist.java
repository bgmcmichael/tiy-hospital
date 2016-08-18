package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class SurgicalOncologist extends Doctor implements canChooseTreatment, canGiveTreatment {
    public SurgicalOncologist(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "Surgical Oncologist";
    }

    @Override
    public void diagnosePatient(Patient aPatient) {}

    @Override
    public void chooseTreatment(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("2")){
            System.out.println("I do not believe this is an oncology issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("2")){
            System.out.println("I do not believe this is a surgical issue.");
        }
        if (patientsDisease.equals(Disease.CANCER_STAGE_3)){
            System.out.println("I believe you have stage 3 cancer, I have the surgery scheduled and I have given the nurses a chemo regiment for you.");
            giveTreatment(aPatient);
        }
        if (patientsDisease.equals(Disease.CANCER_STAGE_4)){
            System.out.println("I believe you have stage 4 cancer, I have the surgery scheduled and I have given the nurses a radiation regiment for you.");
            giveTreatment(aPatient);
        }
    }

    @Override
    public void giveTreatment(Patient aPatient) {
        if (Math.random() >= .5) {
            aPatient.setIsSick(false);
            System.out.println("The surgery was a success! " + aPatient.getFullName() + " may check out of the hospital. Please check with the nurses desk to shedule your additional treatments");
        } else {
            aPatient.setIsSick(true);
            System.out.println("There were complications with the surgery, we will need to schedule another when you are more stable");
        }
    }
}
