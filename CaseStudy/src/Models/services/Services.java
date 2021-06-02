package Models.services;

import Models.service_exception.AreaException;
import Models.service_exception.CostException;
import Models.service_exception.MaxNumberException;
import Models.service_exception.NameServiceException;

import java.util.Scanner;

public abstract class Services {
    private String id;
    private String nameService;
    private double area;
    private int rentalCosts;
    private int maxNumber;
    private String rentalType;
    Scanner scanner = new Scanner(System.in);

    public Services() {
    }

    public Services(String id, String nameService, double area, int rentalCosts, int maxNumber, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxNumber = maxNumber;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService() {
        boolean check;
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
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        double area = 0;
        boolean check;
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
        this.area = area;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts() {
        int rentalCosts = 0;
        boolean check;
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
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber() {
        int maxNumber=0;
        boolean check;
        do {
            check=true;
            try {
                System.out.println("Enter max number of customer: ");
                maxNumber = scanner.nextInt();
                MaxNumberException.maxNumber(maxNumber);
            } catch (MaxNumberException e) {
                check = false;
                e.printStackTrace();
            }
        }while (!check);
        this.maxNumber = maxNumber;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType() {
        String rentalType="";
        boolean check;
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
        }while (!check);
        this.rentalType = rentalType;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", maxNumber=" + maxNumber +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
