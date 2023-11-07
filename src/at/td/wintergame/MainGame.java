package at.td.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors = new ArrayList<>();
    private Player player = new Player();


    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {

        MoveStrategy mr1 = new MoveRight(10, 10, 0.5f);
        MoveStrategy mr2 = new MoveLeft(500, 50, 0.3f);
        MoveStrategy mr3 = new MoveRight(10, 350, 0.5f);
        MoveStrategy toggle1 = new ToggleStrategy ();
        MoveStrategy toggle2 = new ToggleStrategy ();
        MoveStrategy toggle3 = new ToggleStrategy ();
        CircleActor ca1 = new CircleActor(toggle1);
        CircleActor ca2 = new CircleActor(toggle2);
        RectangleActor ra1 = new RectangleActor(toggle3);


        this.player.addObserver(ca1);
        this.player.addObserver(ca2);
        this.player.addObserver(ra1);

        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(ra1);
        this.actors.add(player);


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
