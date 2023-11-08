package at.td.wintergame;

import java.util.Random;

public class RandomActorFactory {

    public static Actor getRandomActor(){
        Random random = new Random();
        MoveStrategy toggle1 = new ToggleStrategy ();
        int number = random.nextInt(3);

        if(number == 0 || number == 1){
            return new CircleActor(toggle1);
        }
        if(number == 2 || number == 3){
            return new RectangleActor(toggle1);
        }
        return new CircleActor(toggle1);
    }
}
