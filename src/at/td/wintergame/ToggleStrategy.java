package at.td.wintergame;

import java.util.Random;

public class ToggleStrategy implements MoveStrategy{
    private float x,y,speed;
    private boolean movesRight = true;

    public ToggleStrategy() {
        Random r = new Random();
        this.x = r.nextInt( 600);
        this.y = r.nextInt(400);
        System.out.println(this.x);
        this.speed = 10;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public void update(int delta) {
        if(movesRight){
            this.x += delta / speed;
            if(this.x > 700){
                movesRight = false;
            }
        }
        else{
            this.x -= delta / speed;
            if(this.x < 50 ){
                movesRight=true;
            }
        }




    }
}
