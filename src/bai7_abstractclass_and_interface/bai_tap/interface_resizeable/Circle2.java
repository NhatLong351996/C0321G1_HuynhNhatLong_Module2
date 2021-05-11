package bai7_abstractclass_and_interface.bai_tap.interface_resizeable;

import bai6_kethua.thuc_hanh.Circle;

public class Circle2 extends Circle implements Resizeable {
    public Circle2(double radius) {
        super(radius);
    }

    @Override
    public double resize(double percent) {
        return percent;
    }
}
