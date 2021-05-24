package bai15_xu_ly_ngoai_le_va_debug.bai_tap;

public class  IllegalTriangleException extends Exception{

    public static void message(double a, double b, double c) throws Exception {
        if (a<=0||b<=0||c<=0){
            throw new Exception("Cạnh tam giác phải là số dương");
        }
        if (a + b <= c || b + c <= a || a + c <= b){
            throw new Exception("Không hợp lệ ");
        }
    }
}
