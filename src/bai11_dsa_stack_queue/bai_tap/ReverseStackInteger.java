package bai11_dsa_stack_queue.bai_tap;

import java.util.Stack;

 class ReverseStack {
     public static void main(String[] args) {
         Stack <Integer> stackinteger1 = new Stack<>();
         for (int i=0;i<4;i++){
             stackinteger1.push(i);
         }
         while (!stackinteger1.isEmpty()){
             System.out.printf("%s ",stackinteger1.pop());
         }
         Stack <String> wstack = new Stack<>();
         String mWork = "Huynh Nhat Long";
         String[] arrayWord = mWork.split(" ");
         for (int i=0;i<arrayWord.length;i++){
             wstack.push(arrayWord[i]);
         }
         System.out.println("\n");
         while (!wstack.isEmpty()){
             System.out.printf("%s ",wstack.pop());
         }
     }
    }



