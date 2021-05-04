package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class Count_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Code Gym";
        System.out.println("Enter a character to check: ");
        char b = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b) {
                count++;
            }
        }
        System.out.println("Numbers of " + b + " appear in string: " + count);
    }
}
