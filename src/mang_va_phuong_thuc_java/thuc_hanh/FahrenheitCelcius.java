package mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class FahrenheitCelcius {
    public static double celciusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        int choice;
        double celcius;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit To Celcius");
            System.out.println("2. Celcius To Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit To Celcius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celcius:");
                    celcius = scanner.nextDouble();
                    System.out.println("Celcius To Fahrenheit: " + celciusToFahrenheit(celcius));
                    break;
                case 3:
                    System.exit(3);
            }
        } while (choice != 3);
    }
}
