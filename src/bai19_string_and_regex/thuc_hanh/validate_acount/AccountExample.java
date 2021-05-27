package bai19_string_and_regex.thuc_hanh.validate_acount;

import java.util.regex.Pattern;

public class AccountExample {
    private boolean isvalid;
    private static final String ACCOUNT_REGEX ="^[_a-z0-9]{6,}$";

    public boolean isIsvalid() {
        return isvalid;
    }

    public boolean validate(String regex){
         isvalid = Pattern.matches(ACCOUNT_REGEX,regex);
        return isvalid;
    }
}
