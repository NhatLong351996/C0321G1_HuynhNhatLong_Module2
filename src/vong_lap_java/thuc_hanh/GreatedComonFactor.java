package vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class GreatedComonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num a:");
        int a = scanner.nextInt();
        System.out.println("Enter num b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Not greated comon factor");
        } else {
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else if (a > b) {
                    a = a - b;
                }
            }
            System.out.println(a + " is greated common factor");
        }
    }
}

