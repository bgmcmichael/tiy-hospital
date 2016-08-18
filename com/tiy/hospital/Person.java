package com.tiy.hospital;

/**
 * Created by fenji on 8/17/2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String fullName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

}
