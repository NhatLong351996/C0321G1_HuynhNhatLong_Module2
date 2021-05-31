package Models;

public abstract class Services {
    private String id;
    private String nameService;
    private double area;
    private int rentalCosts;
    private int maxNumber;
    private String rentalType;

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

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
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
