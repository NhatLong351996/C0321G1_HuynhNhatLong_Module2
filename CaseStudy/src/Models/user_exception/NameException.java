package Models.user_exception;

import java.util.regex.Pattern;

public class NameException extends Exception {
    private static final String NAME_REGEX = "^[A-Z](([ ][A-Z])*[a-z])*$";

    public NameException(String string) {
        super(string);
    }

    public static void nameException(String string) throws NameException {

        boolean check = Pattern.matches(NAME_REGEX, string);
        if (!check) {
            throw new NameException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }
    }
}
