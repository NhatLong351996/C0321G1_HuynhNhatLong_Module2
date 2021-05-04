package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class Sum_Diagonal_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = scanner.nextInt();
        int cols;
        cols = rows;
        float[][] array = new float[rows][cols];
        float sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Enter element " + (col + 1) + " in row " + (row + 1));
                array[row][col] = scanner.nextFloat();
                if (col == row) {
                    sum += array[row][col];
                }
            }
        }
        System.out.println("Array is: ");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(array[row][col] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Sum element in diagonal is: " + sum);
    }
}
