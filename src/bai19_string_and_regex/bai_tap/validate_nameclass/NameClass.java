package bai19_string_and_regex.bai_tap.validate_nameclass;

import java.util.regex.Pattern;

public class NameClass {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public boolean validate(String regex) {
        boolean isvalid = Pattern.matches(CLASS_REGEX, regex);
        return isvalid;
    }
}
