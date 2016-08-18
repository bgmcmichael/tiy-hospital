package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class Oncologist extends Doctor {
    public Oncologist(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "Oncologist";
    }

    @Override
    public void diagnosePatient(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("2")){
            System.out.println("I do not believe this is an oncological issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("1")){
            System.out.println("I do not believe this is a medicinal issue talk to a surgeon.");
        }
        if (patientsDisease.equals(Disease.CANCER_STAGE_1)){
            System.out.println("I believe you have stage 1 cancer, I'll have the nurse begin a chemo regiment.");
            callNurse(Disease.CANCER_STAGE_1, aPatient);
        }
        if (patientsDisease.equals(Disease.CANCER_STAGE_2)){
            System.out.println("I believe you have stage 2 cancer, I'll have the nurse begin a radiation regiment.");
            callNurse(Disease.CANCER_STAGE_2, aPatient);
        }
    }
}
