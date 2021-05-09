package bai6_kethua.bai_tap;

public class Point2d {
    private float x = 0;
    private float y = 0;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Object getXY() {
        Object[] xy = new Object[2];
        xy[0] = x;
        xy[1] = y;
        return "("+xy[0] + "," + xy[1]+")";
    }

    @Override
    public String toString() {
        return "Tọa độ của point2d" + getXY();
    }
}
