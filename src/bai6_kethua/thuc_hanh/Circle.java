package bai6_kethua.thuc_hanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Kế thừa biến toàn cục các lớp khác nhau.
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Tạo phương thức getter và setter cho biến Radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tạo phương thức tính diện tích và chu vi
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius: "
                + getRadius()
                + ", which is subclass of "
                + super.toString();
    }
}
