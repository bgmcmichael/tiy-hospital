package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class Cardiologist extends Doctor {
    public Cardiologist(String firstName, String lastName) {
        super(firstName, lastName);
        typeOfDoctor = "Cardiologist";
    }

    @Override
    public void diagnosePatient(Patient aPatient) {
        String patientsDisease = aPatient.getDisease();
        if (!patientsDisease.substring(0, 1).equals("3")){
            System.out.println("I do not believe this is an cardiac issue.");
        }
        if (!patientsDisease.substring(1, 2).equals("1")){
            System.out.println("I do not believe this is a medicinal issue talk to a surgeon.");
        }
        if (patientsDisease.equals(Disease.HEART_ATTACK_RISK)){
            System.out.println("I believe you have a high risk of heart attack, I'll have the nurse bring you some nitro glycerine pills");
            callNurse(Disease.HEART_ATTACK_RISK, aPatient);
        }
        if (patientsDisease.equals(Disease.HIGH_BLOOD_PRESSURE)){
            System.out.println("I believe you have high blood pressure, I'll have the nurse bring you some blood thinner pills");
            callNurse(Disease.HIGH_BLOOD_PRESSURE, aPatient);
        }
        if (patientsDisease.equals(Disease.HIGH_CHOLESTEROL)){
            System.out.println("I believe you have high cholesterol, I'll have the nurse bring you some cholesterol management pills.");
            callNurse(Disease.HIGH_CHOLESTEROL, aPatient);
        }
    }
}
