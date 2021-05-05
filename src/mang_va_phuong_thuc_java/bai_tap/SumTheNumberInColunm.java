package mang_va_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class SumTheNumberInColunm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the colunms: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println("Enter element " + (col + 1) + " in row " + (row + 1));
                array[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Array is: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "\t");
            }
            System.out.println("\n");
        }
        int colunm;
        boolean check = true;
        do {
            System.out.println("Enter the colunm you want to sum the number:");
            colunm = scanner.nextInt();
            if (colunm >= 1 && colunm <= cols) {
                int sum = 0;
                for (int row = 0; row < array.length; row++) {
                    sum += array[row][colunm - 1];
                }
                System.out.println("Sum of colunm " + colunm + " is " + sum);
            } else {
                System.out.println("Can't sum!");
            }
        } while (check);
    }
}
