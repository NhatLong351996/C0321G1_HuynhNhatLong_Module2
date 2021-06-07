package Models.user_exception;

import java.util.regex.Pattern;

public class ValidateDateOfBirthException{
    private static final String DATE_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]" +
            "|1[012])[\\/\\-]\\d{4}$";


    public static void checkBirthDayException(String string) throws DateOfBirthException {
        boolean check = Pattern.matches(DATE_REGEX, string);
        if (!check) {
            throw new DateOfBirthException("Định dạng không đúng");
        }
        String[] arr = string.split("/");
        int year = Integer.parseInt(arr[2]);
        if (year <= 1900 || year >= 2003) {
            throw new DateOfBirthException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm");
        }
    }


}


