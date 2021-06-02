package Controllers;

import Models.services.Services;

import java.util.Scanner;

public class ShowServices {
    public static void showServices() {
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
                    for (Object villa : AddNewServices.villas) {
                        System.out.println(villa.toString() + "\n");
                    }
                    break;
                case 2:
                    for (Object house : AddNewServices.houses) {
                        System.out.println(house.toString() + "\n");
                    }
                    break;
                case 3:
                    for (Object room : AddNewServices.rooms) {
                        System.out.println(room.toString() + "\n");
                    }
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
