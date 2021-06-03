package Controllers;

import Commons.ReadAndWrite;
import Manager.ManagerService;
import Models.services.House;
import Models.services.Room;
import Models.services.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewServices {
    static Scanner scanner = new Scanner(System.in);
    public static List<Villa> villas = new ArrayList<>();
    public static List<House> houses = new ArrayList<>();
    public static List<Room> rooms = new ArrayList<>();

    public static void addNewServies() throws IOException {
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
                    ReadAndWrite.writeCSV_Villa("src\\Data\\Villa.csv", villas);
                    break;
                case 2:
                    ManagerService.addNewHouse(houses);
                    ReadAndWrite.writeCSV_House("src\\Data\\House.csv", houses);
                    break;
                case 3:
                    ManagerService.addNewRoom(rooms);
                    ReadAndWrite.writeCSV_Room("src\\Data\\Villa.csv", rooms);
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

    /*public static void main(String[] args) {
        System.out.println(villas);
    }*/
}
