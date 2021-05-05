package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element " + (i + 1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter size of array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element " + (i + 1));
            array2[i] = scanner.nextInt();
        }
        int size3 = size1+size2;
        System.out.println(size3);
        int[] array3 = new int[size3];
        int j = 0;
        while (j < array2.length) {
            for (int i = 0; i < array3.length; i++) {
                if (i < array1.length) {
                    array3[i] = array1[i];
                } else {
                    array3[i] = array2[j];
                    j++;
                }
            }
        }
        System.out.print("Array 1 is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nArray 2 is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.print("\nArray concat is: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
