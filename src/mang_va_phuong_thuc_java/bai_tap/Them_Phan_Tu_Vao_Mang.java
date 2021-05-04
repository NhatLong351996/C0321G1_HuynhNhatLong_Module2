package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mang {
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEnter a number to insert: ");
        int numInsert = scanner.nextInt();
        System.out.println("Enter a index of number you want to insert in: ");
        int indexInsert = scanner.nextInt();
        int[] arrayNew = new int[size + 1];
        for (int i = 0; i < arrayNew.length; i++) {
            if (i == indexInsert) {
                arrayNew[i] = numInsert;
                break;
            } else {
                arrayNew[i] = array[i];
            }
        }
        for (int j = indexInsert + 1; j < arrayNew.length; j++) {
            arrayNew[j] = array[j - 1];
        }
        System.out.print("New array after you insert " + numInsert + " at posision " + indexInsert + " is: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]+" ");
        }
    }
}
