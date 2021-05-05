package mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size: ");
             size = scanner.nextInt();
            if (size>20){
                System.out.println("size should not exceed 20");
            }
        }while (size>20);
        int i=0;
        int[] array = new int[size];
        while (i<size){
            System.out.println("Enter element"+(i+1)+" is: ");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","property list:","");
        for (int j=0;j<size;j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int j=0;j<size;j++){
            if (array[j]>max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
