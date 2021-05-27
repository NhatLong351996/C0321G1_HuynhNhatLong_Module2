package bai19_string_and_regex.bai_tap.validate_phonenumber;

import bai19_string_and_regex.bai_tap.validate_nameclass.NameClass;

public class TestPhoneNumber {
    private static String[] strings = {"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String string : strings) {
            boolean check = phoneNumber.validate(string);
            System.out.println("Class's name is " + string + "is valid: " + check);
        }
    }
}
