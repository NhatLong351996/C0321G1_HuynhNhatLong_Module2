package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class Phan_Tu_Lon_Nhat_Mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the cols");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("Enter element " + (col + 1) + " in row " + (row + 1));
                arr[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Array is: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        int x = 0, y = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    x = row;
                    y = col;
                }
            }
        }
        System.out.println("Max in array is: " + max + " coordinates: " + "(" + x + ";" + y + ")");
    }
}
