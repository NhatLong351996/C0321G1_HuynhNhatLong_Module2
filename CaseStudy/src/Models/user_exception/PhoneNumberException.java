package Models.user_exception;

import java.util.regex.Pattern;

public class PhoneNumberException extends Exception {
    private static final String PHONE_REGEX = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";

    public PhoneNumberException(String string) {
        super(string);
    }

    public static void checkPhone(String string) throws PhoneNumberException {
        if (!Pattern.matches(PHONE_REGEX, string)) {
            throw new PhoneNumberException("Số điện thoại không hợp lệ");
        }
    }
}
