package bai15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 canh của tam giác");

            System.out.println("Cạnh thứ nhất: ");
            double a = scanner.nextDouble();
            System.out.println("Cạnh thứ hai: ");
            double b = scanner.nextDouble();
            System.out.println("Cạnh thứ ba: ");
            double c = scanner.nextDouble();
        try {
            System.out.println("a= "+a+" b= "+b+" c= "+c);
            IllegalTriangleException.message(a,b,c);
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }


    }
}
