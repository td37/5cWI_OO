package at.td.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor{

    public RectangleActor(MoveStrategy moveStrategy) {
       super(moveStrategy);
    }


    public void render (Graphics graphics){
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 20, 20);
    }
}
