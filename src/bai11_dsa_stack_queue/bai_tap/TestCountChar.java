package bai11_dsa_stack_queue.bai_tap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestCountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = sc.nextLine();
        char[] chars = string.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);
    }
}
