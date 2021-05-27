package bai19_string_and_regex.bai_tap.validate_phonenumber;

import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)-\\([0][0-9]{9}\\)$";

    public boolean validate(String regex) {
        boolean isvalid = Pattern.matches(PHONE_REGEX, regex);
        return isvalid;
    }
}
