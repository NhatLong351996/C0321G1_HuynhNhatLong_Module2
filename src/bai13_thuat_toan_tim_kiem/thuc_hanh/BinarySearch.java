package bai13_thuat_toan_tim_kiem.thuc_hanh;

import java.lang.reflect.Array;

public class BinarySearch {
    public static int binarySearch(int[] array, int value) {
        int middle;
        int right = array.length - 1;
        int left = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 9, 10, 14, 56, 67, 89, 106, 200};
        System.out.println(binarySearch(array, 4));
        System.out.println(binarySearch(array, 5));

    }
}
