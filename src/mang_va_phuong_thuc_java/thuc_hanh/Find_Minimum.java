package mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class Find_Minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = scanner.nextInt();
        int i = 0;
        int[] array = new int[size];
        while (i < size) {
            System.out.println("element " + (i + 1) + " is: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("List array:");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
