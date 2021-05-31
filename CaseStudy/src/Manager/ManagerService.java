package Manager;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.List;
import java.util.Scanner;

public class ManagerService {
    static Scanner scanner = new Scanner(System.in);

    public static void addNewVilla(List<Services> villas) {
        System.out.println("Enter String ID: ");
        String id = scanner.next();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.next();
        System.out.println("Enter Area: ");
        double area = scanner.nextDouble();
        System.out.println("Enter rentalCosts: ");
        int rentalCosts = scanner.nextInt();
        System.out.println("Enter maxNumber: ");
        int maxNumber = scanner.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = scanner.next();
        System.out.println("Enter roomStandard: ");
        String roomStandard = scanner.next();
        System.out.println("Enter convenients: ");
        String convenients = scanner.next();
        System.out.println("Enter poolArea: ");
        double poolArea = scanner.nextDouble();
        System.out.println("Enter floorNumbers: ");
        int floorNumbers = scanner.nextInt();
        villas.add(new Villa(id, nameService, area, rentalCosts, maxNumber, rentalType, roomStandard, convenients, poolArea, floorNumbers));
    }

    public static void addNewHouse(List<Services> houses) {
        System.out.println("Enter String ID: ");
        String id = scanner.next();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.next();
        System.out.println("Enter Area: ");
        double area = scanner.nextDouble();
        System.out.println("Enter rentalCosts: ");
        int rentalCosts = scanner.nextInt();
        System.out.println("Enter maxNumber: ");
        int maxNumber = scanner.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = scanner.next();
        System.out.println("Enter roomStandard: ");
        String roomStandard = scanner.next();
        System.out.println("Enter convenients: ");
        String convenients = scanner.next();
        System.out.println("Enter floorNumbers: ");
        int floorNumbers = scanner.nextInt();
        houses.add(new House(id, nameService, area, rentalCosts, maxNumber, rentalType, roomStandard, convenients, floorNumbers));
    }

    public static void addNewRoom(List<Services> rooms) {
        System.out.println("Enter String ID: ");
        String id = scanner.next();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.next();
        System.out.println("Enter Area: ");
        double area = scanner.nextDouble();
        System.out.println("Enter rentalCosts: ");
        int rentalCosts = scanner.nextInt();
        System.out.println("Enter maxNumber: ");
        int maxNumber = scanner.nextInt();
        System.out.println("Enter rentalType: ");
        String rentalType = scanner.next();
        System.out.println("Enter freeServices: ");
        String freeServices = scanner.next();
        rooms.add(new Room(id, nameService, area, rentalCosts, maxNumber, rentalType, freeServices));
    }
}
