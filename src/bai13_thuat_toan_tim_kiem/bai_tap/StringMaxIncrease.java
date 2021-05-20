package bai13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMaxIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> listAranged = new LinkedList<>();
            listAranged.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > listAranged.getLast()) {
                    listAranged.add(string.charAt(j));
                }
            }
            if (listAranged.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(listAranged);
            }
            listAranged.clear();
        }
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}
