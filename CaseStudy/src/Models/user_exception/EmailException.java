package Models.user_exception;

import java.util.regex.Pattern;

public class EmailException extends Exception {
    private static final String EMAIL_REGEX = "[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+";

    public EmailException(String string) {
        super(string);
    }

    public static void checkEmail(String string) throws EmailException {
        if (!Pattern.matches(EMAIL_REGEX, string)) {
            throw new EmailException("Email phải đúng định dạng abc@abc.abc");
        }
    }
}
