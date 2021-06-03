package Models.user_exception;

import java.util.regex.Pattern;

public class GenderException extends Exception{
    private static final String GENDER_REGEX= "^([Mm][Aa][Ll][Ee])*([Ff][Ee][Mm][Aa][Ll][Ee])*([Un][Nn][Kk][Nn][Oo][Ww])*$";

    public GenderException(String s) {
        super(s);
    }

    public static void checkGenDer(String string) throws GenderException {
        if (!Pattern.matches(GENDER_REGEX,string)){
            throw new GenderException("nhập vào Male, Female hoặc Unknow");
        }
    }
}
