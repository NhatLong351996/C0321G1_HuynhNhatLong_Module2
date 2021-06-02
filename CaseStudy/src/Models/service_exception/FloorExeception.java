package Models.service_exception;

public class FloorExeception extends Exception {
    public FloorExeception(String s) {
        super(s);
    }

    public static void floorException(int floor) throws FloorExeception {
        if (floor <= 0) {
            throw new FloorExeception("Số tầng phải là số nguyên dương");
        }
    }
}
