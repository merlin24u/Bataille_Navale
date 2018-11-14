package start;

import engine.GameEngineGraphical;
import model.Game;

public class Main {

	public static void main(String[] args) {
		try {
			Game game = new Game(Game.onePlayer);
			GameEngineGraphical g = new GameEngineGraphical(game);
			g.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
