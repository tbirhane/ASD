package game;

public abstract class GameSate {
    private  Game game;
    public GameSate(Game game){
        this.game = game;
    }
    public abstract void play();
}
