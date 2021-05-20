package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSortByStep extends InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            System.out.println("Lấy ra " + x + " Từ mảng so sánh với các giá trị đằng trước");
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Vì " + x + " nhỏ hơn " + array[pos - 1]);
                System.out.println("Di chuyển " + array[pos - 1] + " về sau");
                array[pos] = array[pos - 1];
                pos--;
            }
            System.out.println("Dừng việc so sánh và đưa " + x + " vào vị trí: " + pos);
            array[pos] = x;
        }
    }
}
