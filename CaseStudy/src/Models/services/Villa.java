package Models.services;

import Models.service_exception.AreaException;
import Models.service_exception.FloorExeception;
import Models.service_exception.IDException;
import Models.service_exception.NameServiceException;

public class Villa extends Services {
    private String roomStandard;
    private String convenients;
    private double poolArea;
    private int floorNumbers;


    public Villa() {
    }

    public Villa(String roomStandard, String convenients, double poolArea, int floorNumbers) {
        this.roomStandard = roomStandard;
        this.convenients = convenients;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    public Villa(String id, String nameService, double area, int rentalCosts, int maxNumber, String rentalType, String roomStandard, String convenients, double poolArea, int floorNumbers) {
        super(id, nameService, area, rentalCosts, maxNumber, rentalType);
        this.roomStandard = roomStandard;
        this.convenients = convenients;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    @Override
    public void setId(String id) {
        boolean check;
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
        super.setId(id);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard() {
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
        this.roomStandard = roomStandard;
    }

    public String getConvenients() {
        return convenients;
    }

    public void setConvenients() {
        System.out.println("Convenents: ");
        String convenients = scanner.nextLine();
        this.convenients = convenients;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea() {
        double poolArea = 0;
        boolean check;
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
        this.poolArea = poolArea;
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
                System.out.println("Enter Floors Villa: ");
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
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", convenients='" + convenients + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumbers=" + floorNumbers +
                "} " + super.toString();
    }
}
