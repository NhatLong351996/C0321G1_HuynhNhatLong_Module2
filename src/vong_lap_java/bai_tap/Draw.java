package vong_lap_java.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your choice is rectangle");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Your choice is square triangle");
                System.out.println("botton left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
                System.out.println("botton right");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= 5 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");
                }
                System.out.println("Top left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= 5 - (i - 1)) {
                            System.out.print(" * ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("\n");
                }
                System.out.println("Top right");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j >= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("isoceles triangle");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 3 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 4:
                System.exit(4);
        }
    }
}
