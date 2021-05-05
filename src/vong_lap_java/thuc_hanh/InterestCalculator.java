package vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double toltalinterest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter interest Rate");
        double inter = scanner.nextDouble();
        for (int i=0;i<month;i++){
            toltalinterest+= (money*inter/100)/12*month;
        }
        System.out.println("Money interest is: "+toltalinterest);
    }
}
