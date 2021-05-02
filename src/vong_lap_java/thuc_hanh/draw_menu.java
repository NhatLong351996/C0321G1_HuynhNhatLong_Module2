package vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class draw_menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. triangle");
            System.out.println("2. square");
            System.out.println("3. rectangle");
            System.out.println("4. exit");
            System.out.println("Enter your choice");

            switch (choice) {
                case 1:
                    System.out.println("Your choice is triangle: ");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Your choice is square: ");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("Your choice is rectangle: ");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("no choice!");
            }
        }
    }
}
