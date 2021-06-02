package Models.service_exception;

public class CostException extends Exception{
    public CostException(String s) {
        super(s);
    }

    public static void costException(int cost) throws CostException {
        if (cost<0){
            throw new CostException("Chi phí thuê phải là số dương");
        }
    }
}
