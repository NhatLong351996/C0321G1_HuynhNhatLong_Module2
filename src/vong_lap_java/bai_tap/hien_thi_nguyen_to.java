package vong_lap_java.bai_tap;

import java.util.Scanner;

public class hien_thi_nguyen_to {
    public static void main(String[] args) {
        int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố đầu tiên: ");
        n = scanner.nextInt();
        if (n >= 1) {
            System.out.println(n + " số nguyên tố đầu tiên là: ");
            System.out.println(2);
        }
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
                if (status !=0) {
                    System.out.println(num);
                    i++;
                }
                num++;
                status = 1;
            }
        }
    }
