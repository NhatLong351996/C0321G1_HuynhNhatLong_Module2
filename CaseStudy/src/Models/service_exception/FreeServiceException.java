package Models.service_exception;

import java.util.regex.Pattern;

public class FreeServiceException extends Exception {
    private static final String FRESERVICE_REGEX = "^(massage)*(karaoke)*(food)*(drink)*(car)*$";

    public FreeServiceException(String s) {
        super(s);
    }

    public static void freeSerciceException(String string) throws FreeServiceException {
        boolean check = Pattern.matches(FRESERVICE_REGEX, string);
        if (!check) {
            throw new FreeServiceException("Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
        }
    }
}
