package bai15_xu_ly_ngoai_le_va_debug.bai_tap;

public class Demo {
    public static class X {
       /* public static void main(String [] args){
            try {
                badMethod();
                System.out.print("A");
            }catch (RuntimeException ex){
                System.out.print("B");
            }catch (Exception ex1){
                System.out.print("C");
            }finally{
                System.out.print("D");
            }
            System.out.print("E");
        }
        public static void badMethod(){
            throw new RuntimeException();
        }
    }*/


        /*public static void main(String [] args) {
            try         {
                badMethod();
                System.out.print("A");
            }  catch (Exception ex)  {
                System.out.print("B");
            } finally {
                System.out.print("C");
            }
            System.out.print("D");
        }
        public static void badMethod(){
            throw new Error();
        }
    }*/

        /*public static void main(String args[]) {
            try {
                System.out.print("Hello world ");
            } finally {
                System.out.println("Finally executing ");
            }
        }*/

       /* public static void main(String[] args) {
            try {
                return;
            }
            finally{
                System.out.println( "Finally" );
            }
        }*/

        public static void main(String[] args) {
            try {
                int x = 0;
                int y = 5 / x;
            }catch (ArithmeticException e) {
                System.out.println("Arithmetic");
            }catch (Exception ae) {
                System.out.println("Exception");
            }
            System.out.println("finished");
        }

    }
}
