package Controllers;

import Commons.ReadAndWrite;
import Manager.ManagerService;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewServices {
    static Scanner scanner = new Scanner(System.in);
    public static List<Services> villas = new ArrayList<>();
    public static List<Services> houses = new ArrayList<>();
    public static List<Services> rooms = new ArrayList<>();

    public static void addNewServies() {
        do {
            System.out.println("Which service do you want to add new?\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back To Menu\n" +
                    "5. Exit.");
            int selectServices = scanner.nextInt();

            switch (selectServices) {
                case 1:
                    ManagerService.addNewVilla(villas);
                    ReadAndWrite.writeCSV("Villa.csv", villas);
                    break;
                case 2:
                    ManagerService.addNewHouse(houses);
                    ReadAndWrite.writeCSV("House.csv", houses);
                    break;
                case 3:
                    ManagerService.addNewRoom(rooms);
                    ReadAndWrite.writeCSV("Villa.csv", rooms);
                    break;
                case 4:
                    MainController.displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter again!");
            }
        } while (true);
    }
}
