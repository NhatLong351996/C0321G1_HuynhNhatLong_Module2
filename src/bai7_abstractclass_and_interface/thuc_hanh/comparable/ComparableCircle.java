package bai7_abstractclass_and_interface.thuc_hanh.comparable;

import bai6_kethua.thuc_hanh.Circle;

public class ComparableCircle extends Circle  implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color,filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return -1;
        else if (getRadius() < o.getRadius()) return 1;
        else return -1;
    }
}
