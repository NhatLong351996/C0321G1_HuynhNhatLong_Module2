package Manager;

import Commons.ReadAndWrite;
import Models.user_exception.*;
import Models.users.Customer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    static Scanner scanner = new Scanner(System.in);
    public static void addNewCustomer(List<Customer> customers) {
        boolean check;
        String namePerson="";
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
        String dateOfBirth="";
        do {
            check = true;
            try {
                System.out.println("Enter Date Of Birth: ");
                dateOfBirth = scanner.nextLine();
                DateOfBirthException.birthDayException(dateOfBirth);
            } catch (DateOfBirthException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String gender="";
        do {
            check = true;
            try {
                System.out.println("Enter Gender:");
                gender =scanner.nextLine();
                GenderException.checkGenDer(gender);
            } catch (GenderException e) {
                check=false;
                e.printStackTrace();
            }
            gender = FixGender.fixGender(gender);
        }while (!check);
        String identityNumber="";
        do {
            check = true;
            try {
                System.out.println("Enter Identity Number: ");
                identityNumber = scanner.nextLine();
                IdCardException.idCardException(identityNumber);
            } catch (IdCardException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String phoneNumber="";
        do {
            check = true;
            try {
                System.out.println("Enter Phone Number: ");
                phoneNumber = scanner.nextLine();
                PhoneNumberException.checkPhone(phoneNumber);
            } catch (PhoneNumberException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String email="";
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
        String typeCustomer="";
        do {
            check = true;
            try {
                System.out.println("Enter Type Customer: ");
                typeCustomer = scanner.nextLine();
                TypeCustomerException.checkType(typeCustomer);
            } catch (TypeCustomerException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        System.out.println("Enter Adress: ");
        String adress = scanner.nextLine();
        customers.add(new Customer(namePerson,dateOfBirth,gender,identityNumber,phoneNumber,email,typeCustomer,adress));
    }
    public static void showInformation() throws IOException {
        List<Customer> list = ReadAndWrite.readCSV_Customer("src\\Data\\Customer.csv");
        Collections.sort(list);
        int i=0;
        for (Customer customer:list){
            System.out.println(i+ ". "+ customer+"\n");
            i++;
        }
    }

}
