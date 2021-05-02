package vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num<2){
            System.out.println(num+" is not prime");
        }else {
            int i = 2;
            boolean check=true;
            while (i<num){
                if (num%i==0){
                    System.out.println(num+" is not prime");
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(num+" is prime");
        }
    }
}
