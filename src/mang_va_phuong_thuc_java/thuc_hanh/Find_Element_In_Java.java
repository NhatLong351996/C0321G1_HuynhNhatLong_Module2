package mang_va_phuong_thuc_java.thuc_hanh;

import java.util.Scanner;

public class Find_Element_In_Java {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean check = true;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("position of student "+input_name+" of the list is: "+(i+1));
                check=false;
                break;
            }
        }
        if (check){
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
