package bai7_abstractclass_and_interface.bai_tap.interface_resizeable;

import bai6_kethua.thuc_hanh.Rectangle;

public class Rectangle2 extends Rectangle implements Resizeable {
    public Rectangle2(double width, double length) {
        super(width, length);
    }

    @Override
    public double resize(double percent) {
        return percent;
    }
}
