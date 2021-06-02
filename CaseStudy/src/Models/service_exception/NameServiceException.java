package Models.service_exception;

import java.util.regex.Pattern;

public class NameServiceException extends Exception {
    private static final String NAMESERVICE_REGEX = "^[A-Z]{1}[a-z]+$";

    public NameServiceException(String s) {
        super(s);
    }

    public static void nameServiceException(String string) throws NameServiceException {
        boolean check = Pattern.matches(NAMESERVICE_REGEX, string);
        if (!check) {
            throw new NameServiceException("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
        }
    }
}
