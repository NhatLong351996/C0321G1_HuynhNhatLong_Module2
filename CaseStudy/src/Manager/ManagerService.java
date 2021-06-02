package Manager;

import Models.services.House;
import Models.services.Room;
import Models.services.Services;
import Models.services.Villa;
import java.util.List;


public class ManagerService {

    public static void addNewVilla(List<Object> villas) {
        Villa villa = new Villa();
        villa.setId("");
        villa.setNameService();
        villa.setArea();
        villa.setRentalCosts();
        villa.setMaxNumber();
        villa.setRentalType();
        villa.setRoomStandard();
        villa.setConvenients();
        villa.setPoolArea();
        villa.setFloorNumbers();
        villas.add(villa);

    }

    public static void addNewHouse(List<Object> houses) {
        House house = new House();
        house.setId("");
        house.setNameService();
        house.setArea();
        house.setRentalCosts();
        house.setMaxNumber();
        house.setRentalType();
        house.setRoomStandar();
        house.setConvenient();
        house.setFloorNumbers();
        houses.add(house);

    }

    public static void addNewRoom(List<Object> rooms) {
        Room room = new Room();
        room.setId("");
        room.setNameService();
        room.setArea();
        room.setRentalCosts();
        room.setMaxNumber();
        room.setRentalType();
        room.setFreeServices();
        rooms.add(room);
    }
}
