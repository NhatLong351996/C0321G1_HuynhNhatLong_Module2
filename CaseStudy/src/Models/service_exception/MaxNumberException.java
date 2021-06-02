package Models.service_exception;

public class MaxNumberException extends Exception {
    public MaxNumberException(String s) {
        super(s);
    }

    public static void maxNumber(int maxNumber) throws MaxNumberException {
        if (maxNumber <= 0 || maxNumber >= 20) {
            throw new MaxNumberException("Số lượng người tối đa phải >0 và nhỏ hơn <20");
        }
    }
}
