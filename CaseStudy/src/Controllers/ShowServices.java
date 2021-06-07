package Controllers;
import Manager.ManagerService;
import java.io.IOException;
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
                    ManagerService.showVilla();
                    break;
                case 2:
                    ManagerService.showHouse();
                    break;
                case 3:
                    ManagerService.showRoom();
                    break;
                case 4:
                    ManagerService.showVillaNotDuplicate();
                    break;
                case 5:
                    ManagerService.showHouseNotDuplicate();
                    break;
                case 6:
                    ManagerService.showRoomNotDuplicate();
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
