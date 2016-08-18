package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "General Practitioner";
    }

    @Override
    public void diagnosePatient(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("1")){
            System.out.println("I do not believe this is an general medicine issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("1")){
            System.out.println("I do not believe this is a medicinal issue talk to a surgeon.");
        }
        if (patientsDisease.equals(Disease.ALLERGIES)){
            System.out.println("I believe you have some allergies, I'll have the nurse bring you some anti-hystomine pills");
            callNurse(Disease.ALLERGIES, aPatient);
        }
        if (patientsDisease.equals(Disease.MILD_INFECTION)){
            System.out.println("I believe you have a mild infection, I'll have the nurse bring you some anti-biotics");
            callNurse(Disease.MILD_INFECTION, aPatient);
        }
        if (patientsDisease.equals(Disease.BAD_INFECTION)){
            System.out.println("I believe you have a bad infection, I'll have the nurse bring you some broad-spectrum anti-biotics.");
            callNurse(Disease.BAD_INFECTION, aPatient);
        }
    }
}
