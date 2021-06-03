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
        public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenients() {
        return convenients;
    }

    public void setConvenients(String convenients) {
        this.convenients = convenients;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floor) {
        this.floorNumbers = floor;
    }

    @Override
    public String toString() {
        return super.toString() +","+ roomStandard +
                "," + convenients +
                "," + poolArea +
                "," + floorNumbers;
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
