package bai6_kethua.bai_tap;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public Object getSpeed(){
        Object[] xys = new Object[2];
        xys[0]=xSpeed;
        xys[1]=ySpeed;
        return "Speed = ("+xys[0]+","+xys[1]+")";
    }

    @Override
    public String toString() {
        return super.toString()
                +", "
                +getSpeed();
    }
    public String move(){
        this.setX(getX()+xSpeed);
        this.setY(getY()+ySpeed);
        return super.toString();
    }
}
