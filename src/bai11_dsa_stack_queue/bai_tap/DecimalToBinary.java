package bai11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public void convertBinary(int decimalnum) {
        Stack<Integer> stack = new Stack<>();
        while (decimalnum != 0) {
            stack.push(decimalnum % 2);
            decimalnum = decimalnum / 2;
        }
        while (!stack.isEmpty()) {
            System.out.printf("%text2", stack.pop());
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Decimal: ");
            int decimalnum = scanner.nextInt();
            new DecimalToBinary().convertBinary(decimalnum);
    }
    }

