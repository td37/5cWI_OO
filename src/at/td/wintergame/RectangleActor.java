package at.td.wintergame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor implements Observer{

    private Color color;
    public RectangleActor(MoveStrategy moveStrategy) {
       super(moveStrategy);
       this.color = Color.white;
    }


    public void render (Graphics graphics){
        graphics.setColor(this.color);
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 20, 20);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.cyan;
    }
}
