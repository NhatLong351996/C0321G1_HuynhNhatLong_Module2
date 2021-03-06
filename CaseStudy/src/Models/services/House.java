package Models.services;

import Models.service_exception.FloorExeception;
import Models.service_exception.IDException;
import Models.service_exception.NameServiceException;

public class House extends Services implements Comparable<House> {
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


    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandard) {
        this.roomStandar = roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floor) {
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

    @Override
    public String toString() {
        return super.toString() + "," + roomStandar +
                "," + convenient +
                "," + floorNumbers;
    }

    @Override
    public int compareTo(House o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
