package Models.users;

import Models.user_exception.DateOfBirthException;
import Models.user_exception.EmailException;
import Models.user_exception.IdCardException;
import Models.user_exception.NameException;

import java.util.Scanner;

public abstract class Person {
    private String namePerson;
    private String dateOfBirth;
    private String identityNumber;
    private String phoneNumber;
    private String email;
    Scanner scanner = new Scanner(System.in);

    public Person() {
    }

    public Person(String namePerson, String dateOfBirth, String identityNumber, String phoneNumber, String email) {
        this.namePerson = namePerson;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson() {
        String namePerson = "";
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Enter Name Person: ");
                namePerson = scanner.nextLine();
                NameException.nameException(namePerson);
            } catch (NameException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        this.namePerson = namePerson;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        String dateOfBirth = "";
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Enter Date Of Birth: ");
                namePerson = scanner.nextLine();
                DateOfBirthException.birthDayException(namePerson);
            } catch (DateOfBirthException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber() {
        String identityNumber = "";
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Enter Identity Number: ");
                identityNumber = scanner.nextLine();
                IdCardException.idCardException(namePerson);
            } catch (IdCardException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
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

    public void setEmail() {
        String email = "";
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Enter Email: ");
                email = scanner.nextLine();
                EmailException.checkEmail(email);
            } catch (EmailException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("Enter the name of position");
        String name = scanner.nextLine();
        for (int i = 0;i<name.length();i++){
            if ()
        }
    }
    


}
