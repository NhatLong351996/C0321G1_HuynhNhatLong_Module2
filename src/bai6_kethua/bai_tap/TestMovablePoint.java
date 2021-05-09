package bai6_kethua.bai_tap;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 1, 3);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
