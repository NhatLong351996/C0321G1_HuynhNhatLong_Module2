package Controllers;

import Manager.ManagerService;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
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
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
        }
    }


}
