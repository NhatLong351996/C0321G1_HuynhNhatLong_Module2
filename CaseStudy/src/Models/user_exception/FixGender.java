package Models.user_exception;

public class FixGender {
    public static String fixGender(String string) {
        String newstring = string.toLowerCase();
        String[] arr = newstring.split("");
        String stringfix = arr[0].toUpperCase();
        String n = "";
        for (int i = 1; i < arr.length; i++) {
            n += stringfix.concat(arr[i]);
            stringfix = "";
        }
        return n;
    }

    /*public static void main(String[] args) {
        String s= FixGender.fixGender("FEmaLe");
        System.out.println(s);
    }*/
}
