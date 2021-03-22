package game;

public class Game {
    private int totalPoint;
    private GameSate gameSate;

    public Game(){
        totalPoint = 0;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public GameSate getGameSate() {
        return gameSate;
    }

    public void setGameSate(GameSate gameSate) {
        this.gameSate = gameSate;
    }

    public void play(){
        gameSate.play();
    }
}
