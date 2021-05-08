package bai6_kethua.bai_tap;

public class Cylinder extends Circle {
    private double hight ;

    public Cylinder() {
    }

    public Cylinder(double hight, double radius) {
        super(radius);
        this.hight = hight;

    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double volumeCylinder() {
        return getAreaCircle() * getHight();
    }

    @Override
    public String toString() {
        return " A cylinder with hight = "
                + getHight()
                + " and "
                + super.toString()
                +" .Circle's area = "
                + getAreaCircle()
                + " and cylynder's volume = "
                + volumeCylinder();

    }
}
