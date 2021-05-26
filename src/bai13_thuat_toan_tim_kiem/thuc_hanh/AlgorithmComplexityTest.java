package bai13_thuat_toan_tim_kiem.thuc_hanh;


import java.util.Scanner;

public class AlgorithmComplexityTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();
        int[] arrayAcsii = new int[255];
        for (int i = 0; i < string.length(); i++) {
            int acsii = (int) string.charAt(i);
            arrayAcsii[acsii] += 1;
        }
        int max = 0;
        char c = 0;
        for (int j = 0; j < 255; j++) {
            if (arrayAcsii[j] > max) {
                max = arrayAcsii[j];
                c = (char) j;
            }
        }
        System.out.println("The most appearing character: " + c + " = " + max);
        //Hiển thị số lần xuất hiện của kí tự
        char c1;
        for (int k = 0; k < 255; k++) {
            if (arrayAcsii[k] != 0) {
                c1 = (char) k;
                System.out.printf("%s = %text2; ", c1, arrayAcsii[k]);
            }
        }
        //sắp xếp các chữ cái theo bảng mã Scii

        for (int n = 0; n < string.length(); n++) {
            int num = (int) string.charAt(n);
            arrayAcsii[num] = num;
        }
        System.out.println("Sắp sếp theo acsii tăng dần:");
        for (int i = 0; i < 255; i++) {
            if (arrayAcsii[i] != 0) {
                System.out.printf("%c", ((char) i));
            }
        }
    }
}
