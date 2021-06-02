package Models.service_exception;

import java.util.regex.Pattern;

public class IDException extends Exception {
    private static final String ID_VILLA_REGEX = "^[SVVL]\\-[0-9]{4}$";
    private static final String ID_HOUSE_REGEX = "^[SVHO]\\-[0-9]{4}$";
    private static final String ID_ROOM_REGEX = "^[SVRO]\\-[0-9]{4}$";

    public IDException(String s) {
        super(s);
    }

    public static void idVillaException(String string) throws IDException {
        boolean checkVilla = Pattern.matches(ID_VILLA_REGEX, string);
        if (!checkVilla) {
            throw new IDException("Mã dịch vụ phải đúng định dạng: SVVL-YYYY, với YYYY là các số từ 0-9");
        }
    }

    public static void idHouseException(String string) throws IDException {
        boolean checkHouse = Pattern.matches(ID_HOUSE_REGEX, string);
        if (!checkHouse) {
            throw new IDException("Mã dịch vụ phải đúng định dạng: SVHO-YYYY, với YYYY là các số từ 0-9");
        }
    }

    public static void idRoomException(String string) throws IDException {
        boolean checkRoom = Pattern.matches(ID_ROOM_REGEX, string);
        if (!checkRoom) {
            throw new IDException("Mã dịch vụ phải đúng định dạng: SVRO-YYYY, với YYYY là các số từ 0-9");
        }
    }
}
