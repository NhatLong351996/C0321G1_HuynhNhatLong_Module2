package bai7_abstractclass_and_interface.bai_tap.interface_colorable;

public class TestSquare {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5,3.5);
        Square square = new Square(1.5);
        Rectangle[] arrayShapes = new Rectangle[2];
        arrayShapes[0]= new Rectangle();
        arrayShapes[1]= new Square();
        System.out.println("Area of Rectangle-Aquare: ");
        for (Rectangle shape:arrayShapes){
            System.out.println(shape.getArea());
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
