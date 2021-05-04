package mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class Count_Passing_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size:");
             size= scanner.nextInt();
            if (size>30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);
        int[] array= new int[size];
        int count=0;
        for (int i=0;i<array.length;i++){
            System.out.println("Enter mark of student "+(i+1));
            array[i]=scanner.nextInt();
            if (array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("Array is: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nNumber of students passing the exam: "+count);
    }
}
