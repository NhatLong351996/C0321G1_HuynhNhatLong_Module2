package Models.services;

import Models.service_exception.FreeServiceException;
import Models.service_exception.IDException;

public class Room extends Services {
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

    @Override
    public void setId(String id) {
        boolean check;
        do {
            check = true;
            try {
                System.out.println("Enter ID Room: ");
                id = scanner.nextLine();
                IDException.idRoomException(id);
            } catch (IDException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        super.setId(id);
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices() {
        String freeServices = "";
        boolean check;
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
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                "} " + super.toString();
    }
}
