package game.gameState;

import game.Game;
import game.GameSate;

import java.util.Random;

public class Level2 extends GameSate {
    private Game game;
    private int level;
    public Level2(Game game){
        super(game);
        this.game = game;
        level = 2;
    }
    public void play(){
        System.out.println("points="+addPoints(new Random().nextInt(7)) + " Level=" + level);

    }

    public int addPoints(int newPoints){
        int totalPoints = game.getTotalPoint() + 2 * newPoints;
        if(totalPoints > 20){
            game.setGameSate(new Level3(game));
            totalPoints += 2;
        }
        game.setTotalPoint(totalPoints);
        return totalPoints;
    }
}
