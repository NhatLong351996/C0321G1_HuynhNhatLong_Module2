package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEnter the number to delete: ");
        int numDelete = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (numDelete == array[i]) {
                check = false;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        array[size - 1] = 0;
        if (check) {
            System.out.println("Không có số trong mảng");
        } else {
            System.out.print("Array is replaced: ");
            for (int k = 0; k < size; k++) {
                System.out.print(array[k] + "\t");
            }
        }
    }

}

