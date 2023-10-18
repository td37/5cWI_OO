package at.td.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor implements Actor{
    private double x, y;

    public RectangleActor(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void update (GameContainer gc, int delta){
        this.x++;
    }

    public void render (Graphics graphics){
        graphics.drawRect((float) this.x, (float) this.y, 20, 20);
    }
}
