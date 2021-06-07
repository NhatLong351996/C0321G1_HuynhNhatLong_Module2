package Manager;

import Commons.ReadAndWrite;
import Controllers.AddNewServices;
import Models.service_exception.*;
import Models.services.House;
import Models.services.Room;
import Models.services.Services;
import Models.services.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class ManagerService {
    private static boolean check;
    static Scanner scanner = new Scanner(System.in);

    public static void addNewVilla(List<Villa> villas) {
        String id = "";
        String nameService = "";
        int rentalCosts = 0;
        double area = 0;
        int maxNumber = 0;
        String rentalType = "";
        String roomStandard = "";
        String convenients = "";
        double poolArea = 0;
        int floor = 0;
        do {
            check = true;
            try {
                System.out.println("Enter ID: ");
                id = scanner.nextLine();
                IDException.idVillaException(id);
            } catch (IDException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter Name Service: ");
                nameService = scanner.nextLine();
                NameServiceException.nameServiceException(nameService);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter Area (m2): ");
                area = scanner.nextDouble();
                AreaException.areaException(area);
            } catch (AreaException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter Rental Cost: ");
                rentalCosts = scanner.nextInt();
                CostException.costException(rentalCosts);
            } catch (CostException e) {
                check = false;
                e.printStackTrace();
            }

        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter max number of customer: ");
                maxNumber = scanner.nextInt();
                MaxNumberException.maxNumber(maxNumber);
            } catch (MaxNumberException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter Rental Type: ");
                rentalType = scanner.nextLine();
                NameServiceException.nameServiceException(rentalType);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);

        do {
            check = true;
            try {
                System.out.println("Enter Room Standard: ");
                roomStandard = scanner.nextLine();
                NameServiceException.nameServiceException(roomStandard);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        System.out.println("Convenents: ");
        convenients = scanner.nextLine();
        do {
            check = true;
            try {
                System.out.println("Enter Pool Area: ");
                poolArea = scanner.nextDouble();
                AreaException.areaException(poolArea);
            } catch (AreaException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        do {
            check = true;
            try {
                System.out.println("Enter Floors Villa: ");
                floor = scanner.nextInt();
                FloorExeception.floorException(floor);
            } catch (FloorExeception floorExeception) {
                check = false;
                floorExeception.printStackTrace();
            }
        } while (!check);
        villas.add(new Villa(id, nameService, rentalCosts, (int) area, maxNumber, rentalType, roomStandard, convenients, poolArea, floor));

    }

    public static void addNewHouse(List<House> houses) {
        String id = "";
        do {
            check = true;
            try {
                System.out.println("Enter ID House: ");
                id = scanner.nextLine();
                IDException.idHouseException(id);
            } catch (IDException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String nameService = "";
        do {
            check = true;
            try {
                System.out.println("Enter Name Service: ");
                nameService = scanner.nextLine();
                NameServiceException.nameServiceException(nameService);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        double area = 0;
        do {
            check = true;
            try {
                System.out.println("Enter Area (m2): ");
                area = scanner.nextDouble();
                AreaException.areaException(area);
            } catch (AreaException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        int rentalCosts = 0;
        do {
            check = true;
            try {
                System.out.println("Enter Rental Cost: ");
                rentalCosts = scanner.nextInt();
                CostException.costException(rentalCosts);
            } catch (CostException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        int maxNumber = 0;
        do {
            check = true;
            try {
                System.out.println("Enter max number of customer: ");
                maxNumber = scanner.nextInt();
                MaxNumberException.maxNumber(maxNumber);
            } catch (MaxNumberException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String rentalType = "";
        do {
            check = true;
            try {
                System.out.println("Enter Rental Type: ");
                rentalType = scanner.nextLine();
                NameServiceException.nameServiceException(rentalType);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String roomStandard = "";
        do {
            check = true;
            try {
                System.out.println("Enter Room Standard: ");
                roomStandard = scanner.nextLine();
                NameServiceException.nameServiceException(roomStandard);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        System.out.println("Convenents: ");
        String convenient = scanner.nextLine();
        int floor = 0;
        do {
            check = true;
            try {
                System.out.println("Enter House's Floor: ");
                floor = scanner.nextInt();
                FloorExeception.floorException(floor);

            } catch (FloorExeception floorExeception) {
                check = false;
                floorExeception.printStackTrace();
            }
        } while (!check);
        houses.add(new House(id, nameService, area, rentalCosts, maxNumber, rentalType, roomStandard, convenient, floor));

    }

    public static void addNewRoom(List<Room> rooms) {
        String id = "";
        do {
            check = true;
            try {
                System.out.println("Enter ID House: ");
                id = scanner.nextLine();
                IDException.idHouseException(id);
            } catch (IDException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String nameService = "";
        do {
            check = true;
            try {
                System.out.println("Enter Name Service: ");
                nameService = scanner.nextLine();
                NameServiceException.nameServiceException(nameService);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        double area = 0;
        do {
            check = true;
            try {
                System.out.println("Enter Area (m2): ");
                area = scanner.nextDouble();
                AreaException.areaException(area);
            } catch (AreaException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        int rentalCosts = 0;
        do {
            check = true;
            try {
                System.out.println("Enter Rental Cost: ");
                rentalCosts = scanner.nextInt();
                CostException.costException(rentalCosts);
            } catch (CostException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        int maxNumber = 0;
        do {
            check = true;
            try {
                System.out.println("Enter max number of customer: ");
                maxNumber = scanner.nextInt();
                MaxNumberException.maxNumber(maxNumber);
            } catch (MaxNumberException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String rentalType = "";
        do {
            check = true;
            try {
                System.out.println("Enter Rental Type: ");
                rentalType = scanner.nextLine();
                NameServiceException.nameServiceException(rentalType);
            } catch (NameServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        String freeServices = "";
        do {
            check = true;
            try {
                System.out.println("Enter Free SerVice: ");
                freeServices = scanner.nextLine();
                FreeServiceException.freeSerciceException(freeServices);
            } catch (FreeServiceException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        rooms.add(new Room(id, nameService, area, rentalCosts, maxNumber, rentalType, freeServices));
    }

    public static void showVilla() {
        List<Villa> villas = ReadAndWrite.readCSV_Villa("src\\Data\\Villa.csv");
        int i = 0;
        System.out.println("Danh sách Villa: ");
        for (Villa villa : villas) {
            System.out.println(i + ". " + villa.toString() + "\n");
            i++;
        }
    }

    public static void showHouse() {
        List<House> houses = ReadAndWrite.readCSV_House("src\\Data\\House.csv");
        int i = 0;
        System.out.println("Danh sách House: ");
        for (House house : houses) {
            System.out.println(i + ". " + house.toString() + "\n");
            i++;
        }
    }

    public static void showRoom() {
        List<Room> rooms = ReadAndWrite.readCSV_Room("src\\Data\\Room.csv");
        int i = 0;
        System.out.println("Danh sách Room: ");
        for (Room room : rooms) {
            System.out.println(i + ". " + room.toString() + "\n");
        }
    }

    public static void showVillaNotDuplicate() {
        List<Villa> villas = ReadAndWrite.readCSV_Villa("src\\Data\\Villa.csv");
        TreeSet<Villa> emptyVilla = new TreeSet<>();
        TreeSet<Villa> treeSet = new TreeSet<>();
        for (Villa villa : villas) {
            if (treeSet.contains(villa) || emptyVilla.contains(villa)) {
                treeSet.remove(villa);
                emptyVilla.add(villa);
            } else {
                treeSet.add(villa);
            }
        }
        for (Villa villa : treeSet) {
            System.out.println(villa + "\n");
        }
    }

    public static void showHouseNotDuplicate() {
        List<House> houses = ReadAndWrite.readCSV_House("src\\Data\\House.csv");
        TreeSet<House> houseTreeSet = new TreeSet<>();
        TreeSet<House> emptyHouses = new TreeSet<>();
        for (House house : houses) {
            if (houseTreeSet.contains(house) || emptyHouses.contains(house)) {
                houseTreeSet.remove(house);
                emptyHouses.add(house);
            } else {
                houseTreeSet.add(house);
            }
        }
        for (House house : houseTreeSet) {
            System.out.println(house + "\n");
        }
    }
    public static void showRoomNotDuplicate(){
        List<Room> rooms = ReadAndWrite.readCSV_Room("src\\Data\\Room.csv");
        TreeSet<Room> roomTreeSet = new TreeSet<>();
        TreeSet<Room> emptyRoomTreeSet = new TreeSet<>();
        for (Room room: rooms){
            if (roomTreeSet.contains(room)||emptyRoomTreeSet.contains(room)){
                roomTreeSet.remove(room);
                emptyRoomTreeSet.add(room);
            }else {
                roomTreeSet.add(room);
            }
        }
        for (Room room: roomTreeSet){
            System.out.println(room+"\n");
        }
    }

    public static void main(String[] args) {
        showVillaNotDuplicate();

    }
}
