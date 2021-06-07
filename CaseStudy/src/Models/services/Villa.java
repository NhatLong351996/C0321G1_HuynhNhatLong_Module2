package Models.services;

public class Villa extends Services implements Comparable<Villa> {
    private String roomStandard;
    private String convenient;
    private double poolArea;
    private int floorNumbers;


    public Villa() {
    }

    public Villa(String roomStandard, String convenient, double poolArea, int floorNumbers) {
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }

    public Villa(String id, String nameService, double area, int rentalCosts, int maxNumber, String rentalType, String roomStandard
            , String convenients, double poolArea, int floorNumbers) {
        super(id, nameService, area, rentalCosts, maxNumber, rentalType);
        this.roomStandard = roomStandard;
        this.convenient = convenients;
        this.poolArea = poolArea;
        this.floorNumbers = floorNumbers;
    }
        public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
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
                "," + convenient +
                "," + poolArea +
                "," + floorNumbers;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", convenients='" + convenient + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumbers=" + floorNumbers +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Villa o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
