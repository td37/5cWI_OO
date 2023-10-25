package at.td.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor{

    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 10, 10);
    }
}
