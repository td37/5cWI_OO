package at.td.wintergame;

public class MoveRight implements MoveStrategy{

    private float x, y, speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update (int delta){
        this.x += delta * speed;
    }

    public float getX() {
        return x;
    }


    public float getY() {
        return y;
    }


    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
