package game.gameState;

import game.Game;
import game.GameSate;

import java.util.Random;

public class Level3 extends GameSate {
    private Game game;
    private int level;
    public Level3(Game game){
        super(game);
        this.game = game;
        level = 3;
    }

    public void play(){
        System.out.println("points="+addPoints(new Random().nextInt(7)) + " Level=" + level);

    }

    public int addPoints(int newPoints){
        int totalPoints = game.getTotalPoint() + 3 * newPoints;
        game.setTotalPoint(totalPoints);
        return totalPoints;
    }
}
