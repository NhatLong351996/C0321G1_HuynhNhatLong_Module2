package Models.user_exception;

import java.util.regex.Pattern;

 public class ValidateCustomer  {
    private static final String TYPE_REGEX = "(Diamond)*(Platinium)*(Gold)*(Silver)*(Member)*$";
    public static void checkType(String string) throws CustomerException {
        if (!Pattern.matches(TYPE_REGEX, string)) {
        throw new CustomerException("Không đúng định dạng");
        }
    }
}
