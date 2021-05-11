package bai7_abstractclass_and_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements Colorable{
    public Square(){
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }
    //Lấy cạnh hình vuông trả về giá trị = Lấy chiều rộng/Chiều dài hình chữ nhật
    public double getSide(){
        return getWidth();
    }
    //Thay đổi cạnh hình vuông giống thay đổi chiều dài, rộng hình chữ nhật
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
