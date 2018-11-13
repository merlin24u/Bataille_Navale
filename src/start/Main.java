package start;

import engine.GameEngineGraphical;
import model.Game;
import model.MyPainter;

public class Main {

	public static void main(String[] args) {
		try {
			Game game = new Game(Game.onePlayer);
			MyPainter painter = new MyPainter(game.getPlayerMap(),
					game.getOppMap());
			GameEngineGraphical g = new GameEngineGraphical(game, painter);
			g.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
