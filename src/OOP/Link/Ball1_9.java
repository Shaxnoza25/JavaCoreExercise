package OOP.Link;

public class Ball1_9 {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball1_9(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.yDelta = yDelta;
        this.xDelta = xDelta;

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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball1_9[(" +x+", " + y + ", speed=(" +xDelta + ", "+yDelta+")]";
    }
}