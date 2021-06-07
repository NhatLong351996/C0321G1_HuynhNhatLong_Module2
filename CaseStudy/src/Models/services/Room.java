package Models.services;

import Models.service_exception.FreeServiceException;
import Models.service_exception.IDException;

public class Room extends Services implements Comparable<Room> {
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id, String nameService, double area, int rentalCosts, int maxNumber, String rentalType, String freeServices) {
        super(id, nameService, area, rentalCosts, maxNumber, rentalType);
        this.freeServices = freeServices;
    }


    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                "} " + super.toString();
    }

    @Override
    public String toString() {
        return super.toString()+"," + freeServices ;
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
