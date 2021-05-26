package introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        int usd = sc.nextInt();
        int vnd = usd*23000;
        System.out.printf("%-20s%s","USD","VND\n");
        System.out.printf("%-20d%text2",usd,vnd);
    }
}
