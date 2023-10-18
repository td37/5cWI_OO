package at.td.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors = new ArrayList<>();


    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        CircleActor ca1 = new CircleActor(100, 100);
        CircleActor ca2 = new CircleActor(100, 200);
        RectangleActor ra1 = new RectangleActor(60, 500);

        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(ra1);

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor a : this.actors) {
            a.update(gc, delta);
        }

    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor a : this.actors) {
            a.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
