package bai19_string_and_regex.thuc_hanh.validate_acount;

public class AccountExampleTest {
    public static final String[] validAcount = {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAcount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String acount : validAcount) {
            accountExample.validate(acount);
            System.out.println("Acount is: " + acount + " is valid: " + accountExample.isIsvalid());
        }
        for (String acount : invalidAcount) {
            boolean invalid = accountExample.validate(acount);
            System.out.println("Acount is: " + acount + " is valid: " + invalid);
        }
    }
}
