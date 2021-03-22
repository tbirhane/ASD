package game;

import java.util.Collection;

import game.gameState.Level1;




public class Application {
	public static void main(String[] args) {


			Game game = new Game();
			GameSate gameSate = new Level1(game);
			game.setGameSate(gameSate);
			game.play();

	}

}


