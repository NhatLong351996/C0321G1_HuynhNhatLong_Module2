package Controllers;

import Commons.ReadAndWrite;
import Models.services.House;
import Models.services.Room;
import Models.services.Services;
import Models.services.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowServices {
    public static void showServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select To Show: \n" +
                    "1. Show All Villa\n" +
                    "2. Show All House\n" +
                    "3. Show All Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit.");
            int selectShow = scanner.nextInt();
            switch (selectShow) {
                case 1:
                    List<String> villa = ReadAndWrite.readCSV("src\\Data\\Villa.csv");
                    System.out.println(villa);
                    break;
                case 2:
                    List<String> house = ReadAndWrite.readCSV("src\\Data\\House.csv");
                    System.out.println(house);
                    break;
                case 3:
                    List<String> room = ReadAndWrite.readCSV("src\\Data\\Room.csv");
                    System.out.println(room);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    MainController.displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter again!");
            }
        } while (true);
    }
}
