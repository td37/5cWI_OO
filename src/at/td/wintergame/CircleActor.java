package at.td.wintergame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor implements Observer{

    private Color color;
    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 10, 10);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.orange;
    }
}
