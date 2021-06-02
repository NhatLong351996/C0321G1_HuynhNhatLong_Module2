package Models.user_exception;

import java.util.regex.Pattern;

public class IdCardException extends Exception {
    private static final String CARD_REGEX = "^[0-9]{3}([ ][0-9]{3}){2}$";

    public IdCardException(String string) {
        super(string);
    }

    public static void idCardException(String string) throws IdCardException {
        if (!Pattern.matches(CARD_REGEX, string)) {
            throw new IdCardException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }
}
