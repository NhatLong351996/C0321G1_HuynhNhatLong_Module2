package Controllers;

import Commons.ReadAndWrite;
import Manager.ManagerCustomer;
import Manager.ManagerService;
import Models.*;
import Models.users.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customer = new ArrayList<>();

    public static void displayMainMenu() throws IOException {
        do {
            System.out.println("Select: \n" +
                    "1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit.");
            int selectMenu = scanner.nextInt();
            switch (selectMenu) {
                case 1:
                    AddNewServices.addNewServies();
                    break;
                case 2:
                    ShowServices.showServices();
                    break;
                case 3:
                    ManagerCustomer.addNewCustomer(customer);
                    ReadAndWrite.writeCSV_Customer("src\\Data\\Customer.csv",customer);
                    break;
                case 4:
                    ManagerCustomer.showInformation();
                    break;
                case 5:
                    ManagerCustomer.showInformation();
                    System.out.println("Nhập thứ tự khách hàng cần book ");
                    int number = scanner.nextInt();
                    List<Customer> list = ReadAndWrite.readCSV_Customer("src\\Data\\Customer.csv");
                    Customer customer= list.get(number);
                    ReadAndWrite.writeCSV_Booking("src\\Data\\FileBooking.csv",customer);
                    System.out.println("Nhập dịch vụ cần book: "+"\n"
                    +"1. Booking Villa.\n"
                    +"2. Booking House.\n"
                    +"3. Booking Room.\n");
                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            break;
                        case 3:
                    }


                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
        }while (true);

    }

    public static void main(String[] args) throws IOException {
        MainController.displayMainMenu();
    }


}
