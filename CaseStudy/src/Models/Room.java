package Models;

public class Room extends Services {
    private String freeServices;

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
}
