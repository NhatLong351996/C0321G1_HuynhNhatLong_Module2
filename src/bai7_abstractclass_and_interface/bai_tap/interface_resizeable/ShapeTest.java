package bai7_abstractclass_and_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(1.5);
        Rectangle2 rectangle2 = new Rectangle2(3.0, 5.6);
        Square2 square2 = new Square2(1.2);
        double[] shapes = new double[3];
        shapes[0] = circle2.getArea();
        shapes[1] = rectangle2.getArea();
        shapes[2] = square2.getArea();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời nhập tỉ lệ cho Circle: ");
        double numCircle = scanner.nextDouble();
        System.out.println(" Mời nhập tỉ lệ cho Rectangle: ");
        double numRectangle = scanner.nextDouble();
        System.out.println(" Mời nhập tỉ lệ cho Square: ");
        double numSquare = scanner.nextDouble();
        System.out.println(" Pre-Area of Circle-Rectangle-Square: ");
        for (double shape : shapes) {
            System.out.println(shape);
        }
        System.out.println(" After-Area of Circle-Rectangle-Square: " + shapes[0] * circle2.resize(numCircle)
                + "-" + shapes[1] * rectangle2.resize(numRectangle) + "-" + shapes[2] * square2.resize(numSquare));


    }
}
