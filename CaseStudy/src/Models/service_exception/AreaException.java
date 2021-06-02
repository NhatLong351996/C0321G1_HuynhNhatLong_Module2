package Models.service_exception;

public class AreaException extends Exception {
    public AreaException(String s) {
        super(s);
    }

    public static void areaException(double area) throws AreaException {
        if (area <= 30) {
            throw new AreaException("Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2");
        }
    }
}
