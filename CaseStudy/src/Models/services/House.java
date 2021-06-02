package Models.services;

import Models.service_exception.FloorExeception;
import Models.service_exception.IDException;
import Models.service_exception.NameServiceException;

public class House extends Services {
    private String roomStandar;
    private String convenient;
    private int floorNumbers;

    public House() {
    }

    public House(String roomStandar, String convenient, int floorNumbers) {
        this.roomStandar = roomStandar;
        this.convenient = convenient;
        this.floorNumbers = floorNumbers;
    }

    public House(String id, String nameService, double area, int rentalCosts, int maxNumber, String rentalType, String roomStandar, String convenient, int floorNumbers) {
        super(id, nameService, area, rentalCosts, maxNumber, rentalType);
        this.roomStandar = roomStandar;
        this.convenient = convenient;
        this.floorNumbers = floorNumbers;
    }

    @Override
    public void setId(String id) {
        boolean check;
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
        super.setId(id);
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar() {
        String roomStandard = "";
        boolean check;
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
        this.roomStandar = roomStandar;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient() {
        System.out.println("Convenents: ");
        String convenient = scanner.nextLine();
        this.convenient = convenient;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers() {
        int floor = 0;
        boolean check;
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
        this.floorNumbers = floor;
    }

    @Override
    public String showInfor() {
        return "House{" +
                "roomStandar='" + roomStandar + '\'' +
                ", convenient='" + convenient + '\'' +
                ", floorNumbers=" + floorNumbers +
                "} " + super.toString();
    }
}
