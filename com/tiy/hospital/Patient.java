package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class Patient extends Person{

    private boolean isSick = true;
    private String disease = Disease.generateDisease();

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setIsSick(boolean sick) {
        isSick = sick;
    }

    public boolean isSick() {
        return isSick;
    }

    public String getDisease() {
        return disease;
    }

}
