package bai19_string_and_regex.bai_tap.validate_nameclass;

public class TestNameClass {
    private static String[] strings = {"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        for (String string : strings) {
            boolean check = nameClass.validate(string);
            System.out.println("Class's name is " + string + "is valid: " + check);
        }
    }
}
