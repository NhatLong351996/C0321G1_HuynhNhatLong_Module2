package bai6_kethua.bai_tap;

public class Point3d extends Point2d {
    private double z = 0;

    public Point3d() {
    }

    public Point3d(double z) {
        this.z = z;
    }

    public Point3d(float x, float y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Object getXYZ() {
        Object[] xyz = new Object[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = getZ();
        return "(" + xyz[0] + "," + xyz[1] + "," + xyz[2] + ")";
    }

    @Override
    public String toString() {
        return "Tọa độ point 3d: "
                + getXYZ();
    }
}
