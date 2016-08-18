package com.tiy.hospital;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fenji on 8/17/2016.
 */
public class HospitalRunner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = "", lastName = "", doctorMenu= "";
        Patient[] thePatients;
        Doctor[] doctorList = new Doctor[Doctor.kindsOfDoctor];

        /*System.out.println("What is the General Practitioner's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the General Practitioner's last name?");
        lastName = scan.nextLine();
        doctorList[0] = new GeneralPractitioner(firstName, lastName);

        System.out.println("What is the Oncologist's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the Oncologist's last name?");
        lastName = scan.nextLine();
        doctorList[1] = new Oncologist(firstName, lastName);

        System.out.println("What is the Cardiologist's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the Cardiologist's last name?");
        lastName = scan.nextLine();
        doctorList[2] = new Cardiologist(firstName, lastName);

        System.out.println("What is the General Surgeon's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the General Surgeon's last name?");
        lastName = scan.nextLine();
        doctorList[3] = new GeneralSurgeon(firstName, lastName);

        System.out.println("What is the Surgical Oncologist's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the Surgical Oncologist's last name?");
        lastName = scan.nextLine();
        doctorList[4] = new SurgicalOncologist(firstName, lastName);

        System.out.println("What is the Cardiac Surgeon's first name?");
        firstName = scan.nextLine();
        System.out.println("What is the Cardiac Surgeon's last name?");
        lastName = scan.nextLine();
        doctorList[5] = new CardiacSurgeon(firstName, lastName);**/

        doctorList[0] = new GeneralPractitioner("ben", "McDoc");
        doctorList[1] = new Oncologist("john", "McDoc");
        doctorList[2] = new Cardiologist("mark", "McDoc");
        doctorList[3] = new GeneralSurgeon("marge", "McCuts");
        doctorList[4] = new SurgicalOncologist("susan", "McCuts");
        doctorList[5] = new CardiacSurgeon("amber", "McCuts");
        for (int counter = 0; counter < doctorList.length; counter++){
            doctorMenu += (counter + 1) + "- " + doctorList[counter].getFullName() +
                    ", " + doctorList[counter].typeOfDoctor + "\n";
        }

        System.out.println("How many patients is this hospital helping?");
        int numPatients = Integer.valueOf(scan.nextLine());
        thePatients = new Patient[numPatients];

        for (int counter = 0; counter < numPatients; counter++) {
            System.out.println("What is patient " + (counter + 1) + "'s first name?");
            firstName = scan.nextLine();
            System.out.println("What is patient " + (counter + 1) + "'s last name?");
            lastName = scan.nextLine();
            thePatients[counter] = new Patient(firstName, lastName);
        }

        for (int counter = 0; counter < numPatients; counter++){
            while (thePatients[counter].isSick()){
                int userChoice = 0;
                System.out.println("which doctor should see " + thePatients[counter].getFullName());
                System.out.println(doctorMenu);
                userChoice = Integer.valueOf(scan.nextLine());
                if (userChoice == 1) {
                    doctorList[userChoice - 1].diagnosePatient(thePatients[counter]);
                }
                if (userChoice == 2) {
                    doctorList[userChoice - 1].diagnosePatient(thePatients[counter]);
                }
                if (userChoice == 3) {
                    doctorList[userChoice - 1].diagnosePatient(thePatients[counter]);
                }
                if (userChoice == 4) {
                    GeneralSurgeon surgeon = (GeneralSurgeon)doctorList[3];
                    surgeon.chooseTreatment(thePatients[counter]);
                }
                if (userChoice == 5) {
                    SurgicalOncologist surgeon = (SurgicalOncologist) doctorList[4];
                    surgeon.chooseTreatment(thePatients[counter]);
                }
                if (userChoice == 6) {
                    CardiacSurgeon surgeon = (CardiacSurgeon) doctorList[5];
                    surgeon.chooseTreatment(thePatients[counter]);
                }
            }


        }
        System.out.println("All Patients have been treated correctly!");
    }
}
