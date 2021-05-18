package bai11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public void checkBracket(String string) {
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.isEmpty()) {
                System.out.println("FAULT");
                break;
            } else if (string.charAt(i) == '(') {
                stack.push('(');
            } else if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    check = false;
                } else {
                    stack.pop();
                    check = true;
                }
            }
        }
        if (check && stack.isEmpty()) {
            System.out.println("TRUE");
        } else
            System.out.println("FAULT");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String expression = scanner.nextLine();
        Bracket bracket = new Bracket();
        bracket.checkBracket(expression);
    }

}
