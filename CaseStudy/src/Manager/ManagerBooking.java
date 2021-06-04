package Manager;

import Commons.ReadAndWrite;
import Models.services.House;
import Models.services.Room;
import Models.services.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerBooking {
    static Scanner scanner = new Scanner(System.in);

    public static int showListToBook() {
            System.out.println("Nhập dịch vụ cần book: " + "\n"
                    + "1. Booking Villa.\n"
                    + "2. Booking House.\n"
                    + "3. Booking Room.\n");
            int select = scanner.nextInt();
        return select;
    }

    public static void bookingVilla() {
        ManagerService.showVilla();
        System.out.println("\nChọn dịch vụ villa theo số thứ tự:");
        int select = scanner.nextInt();
        List<Villa> villas = ReadAndWrite.readCSV_Villa("src\\Data\\Villa.csv");
        Villa villa = villas.get(select);
        ReadAndWrite.writeVilla_Booking("src\\Data\\FileBooking.csv", villa);
    }
    public static void bookingHouse() {
        ManagerService.showHouse();
        System.out.println("\nChọn dịch vụ House theo số thứ tự:");
        int select = scanner.nextInt();
        List<House> houses = ReadAndWrite.readCSV_House("src\\Data\\Villa.csv");
        House house = houses.get(select);
        ReadAndWrite.writeHouse_Booking("src\\Data\\FileBooking.csv", house);
    }
    public static void bookingRoom(){
        ManagerService.showRoom();
        System.out.println("\n Chọn dịch vụ Room theo số thứ tự:");
        int select = scanner.nextInt();
        List<Room> rooms = ReadAndWrite.readCSV_Room("src\\Data\\Room.csv");
        Room room = rooms.get(select);
        ReadAndWrite.writeRoom_Booking("src\\Data\\FileBooking.csv",room);
    }


}
