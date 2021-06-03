package Models.user_exception;

import java.util.regex.Pattern;

 public class TypeCustomerException extends Exception {
    private static final String TYPE_REGEX = "(Diamond)*(Platinium)*(Gold)*(Silver)*(Member)*$";

    public TypeCustomerException(String string) {
        super(string);
    }

    public static void checkType(String string) throws TypeCustomerException {
        if (!Pattern.matches(TYPE_REGEX, string)) {
            throw new TypeCustomerException("Không hợp lệ! ");
        }
    }
}
