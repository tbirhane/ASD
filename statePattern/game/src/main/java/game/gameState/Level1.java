package game.gameState;

import game.Game;
import game.GameSate;

import java.util.Random;

public class Level1 extends GameSate {
    private Game game;
    private int level;
    public Level1(Game game){
        super(game);
        this.game = game;
        level = 1;
    }
    public void play(){
        System.out.println("points="+addPoints(new Random().nextInt(7)) + " Level=" + level);

    }

    public int addPoints(int newPoints) {
        int totalPoints = game.getTotalPoint() + newPoints;
        if(totalPoints > 10){
            game.setGameSate(new Level2(game));
            totalPoints += 1;
        }
        game.setTotalPoint(totalPoints);
        return totalPoints;
    }
}
