package lop_va_doi_tuong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public int getRadius() {
        return radius;
    }

    public boolean getOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Speed= " + speed + ", Status= " + on + ", Radius=  " + radius + ", color: " + color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(2);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
