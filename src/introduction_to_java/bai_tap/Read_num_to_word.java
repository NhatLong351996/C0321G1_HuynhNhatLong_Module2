package introduction_to_java.bai_tap;

import java.util.Scanner;

public class Read_num_to_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num >= 0 && num < 10) {
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (num < 20) {
            int ones = num - 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;

            }
        } else if (num < 100) {
            String a = "";
            String b = "";
            int ones = num % 10;
            int tens = (num - ones) / 10;
            switch (tens) {
                case 2:
                    a = "Twenty ";
                    break;
                case 3:
                    a = "Thirty ";
                    break;
                case 4:
                    a = "Fourty ";
                    break;
                case 5:
                    a = "Fifty ";
                    break;
                case 6:
                    a = "Sixty ";
                    break;
                case 7:
                    a = "Seventy ";
                    break;
                case 8:
                    a = "Eighty ";
                    break;
                case 9:
                    a = "Ninety ";
                    break;
            }
            switch (ones) {
                case 1:
                    b = "One";
                    break;
                case 2:
                    b = "Two";
                    break;
                case 3:
                    b = "Three";
                    break;
                case 4:
                    b = "Four";
                    break;
                case 5:
                    b = "Five";
                    break;
                case 6:
                    b = "Six";
                    break;
                case 7:
                    b = "Seven";
                    break;
                case 8:
                    b = "Eight";
                    break;
                case 9:
                    b = "Nine";
                    break;
            }
            System.out.printf("Read: %s%s", a, b);
        } else if (num < 1000) {
            int hundreds = num / 100;
            int tens = (num % 100) / 10;
            int ones = num % 10;
            String a = "";
            String b = "";
            String c = "";
            switch (hundreds) {
                case 1:
                    a = "One ";
                    break;
                case 2:
                    a = "Two";
                    break;
                case 3:
                    a = "Three";
                    break;
                case 4:
                    a = "Four";
                    break;
                case 5:
                    a = "Five";
                    break;
                case 6:
                    a = "Six";
                    break;
                case 7:
                    a = "Seven";
                    break;
                case 8:
                    a = "Eight";
                    break;
                case 9:
                    a = "Nine";
                    break;
            }
            if (tens==0 && ones==0){
                System.out.printf("%s hundred",a);
            }else if (tens == 1) {
                switch (ones) {
                    case 0:
                        b = "ten";
                        break;
                    case 1:
                        b = "Eleven";
                        break;
                    case 2:
                        b = "Twelve";
                        break;
                    case 3:
                        b = "Thirteen";
                        break;
                    case 4:
                        b = "Fourteen";
                        break;
                    case 5:
                        b = "Fifteen";
                        break;
                    case 6:
                        b = "Sixteen";
                        break;
                    case 7:
                        b = "Seventeen";
                        break;
                    case 8:
                        b = "Eighteen";
                        break;
                    case 9:
                        b = "Nineteen";
                        break;
                }System.out.printf("Read: %s hundred and %s%s", a, b, c);
            }
            else {
                switch (tens) {
                    case 2:
                        b = "Twenty ";
                        break;
                    case 3:
                        b = "Thirty ";
                        break;
                    case 4:
                        b = "Fourty ";
                        break;
                    case 5:
                        b = "Fifty ";
                        break;
                    case 6:
                        b = "Sixty ";
                        break;
                    case 7:
                        b = "Seventy ";
                        break;
                    case 8:
                        b = "Eighty ";
                        break;
                    case 9:
                        b = "Ninety ";
                        break;
                }
                switch (ones) {
                    case 1:
                        c = "One ";
                        break;
                    case 2:
                        c = "Two";
                        break;
                    case 3:
                        c = "Three";
                        break;
                    case 4:
                        c = "Four";
                        break;
                    case 5:
                        c = "Five";
                        break;
                    case 6:
                        c = "Six";
                        break;
                    case 7:
                        c = "Seven";
                        break;
                    case 8:
                        c = "Eight";
                        break;
                    case 9:
                        c = "Nine";
                        break;
                }System.out.printf("Read: %s hundred and %s%s", a, b, c);
            }
        }
    }
}
