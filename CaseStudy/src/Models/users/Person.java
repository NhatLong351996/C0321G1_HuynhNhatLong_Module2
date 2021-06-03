package Models.users;

import Models.user_exception.*;

import java.util.Scanner;

public abstract class Person {
    private String namePerson;
    private String dateOfBirth;
    private String gender;
    private String identityNumber;
    private String phoneNumber;
    private String email;


    public Person() {
    }

    public Person(String namePerson, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email) {
        this.namePerson = namePerson;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return namePerson +
                "," + dateOfBirth +
                "," + gender +
                "," + identityNumber +
                "," + phoneNumber +
                "," + email;
    }

}
