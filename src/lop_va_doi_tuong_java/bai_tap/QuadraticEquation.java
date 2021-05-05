package lop_va_doi_tuong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("Enter a: ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("value a should not equal 0");
            }
        } while (a == 0);
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Equation has 2 solutions: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Equation has 1 solutions: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Equation has no solution!");
        }
    }
}
