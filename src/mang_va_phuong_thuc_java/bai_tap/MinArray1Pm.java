package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class MinArray1Pm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
        int min = array[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Min value in array is: " + min + " at position: " + (index + 1));
    }
}
