package bai7_abstractclass_and_interface.bai_tap.interface_resizeable;

import bai6_kethua.thuc_hanh.Square;

public class Square2 extends Square implements Resizeable {
    public Square2(double side) {
        super(side);
    }

    @Override
    public double resize(double percent) {
        return percent;
    }
}
