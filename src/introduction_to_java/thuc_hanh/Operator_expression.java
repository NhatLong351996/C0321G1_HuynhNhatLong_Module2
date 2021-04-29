package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Operator_expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        double area = width*height;
        System.out.println("area is: "+area);

    }
}
