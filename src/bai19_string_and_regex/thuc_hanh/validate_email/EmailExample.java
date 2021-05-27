package bai19_string_and_regex.thuc_hanh.validate_email;


import java.util.regex.Pattern;

public class EmailExample {

    private final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public boolean validate(String regex) {
        boolean matches = Pattern.matches(EMAIL_REGEX, regex);
        return matches;
    }
}
