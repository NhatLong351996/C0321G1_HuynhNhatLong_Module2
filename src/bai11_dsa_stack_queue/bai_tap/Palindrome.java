package bai11_dsa_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public void checkPalindrome(String string) {
        Queue<Character> queue = new LinkedList();
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }
        boolean check = true;
        for (int i = string.length() - 1; i >= 0; i--) {
            if (queue.remove() != string.charAt(i)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check:");
        String string = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(string);
    }
}
