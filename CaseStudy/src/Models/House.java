package Models;

public class House extends Services {
    private String roomStandar;
    private String convenient;
    private int floorNumbers;

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

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
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

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
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
