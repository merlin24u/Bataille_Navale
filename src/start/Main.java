package start;

import engine.GameEngineGraphical;
import model.Game;
import model.XVIe;

public class Main {

	public static void main(String[] args) {
		try {
			Game game = new Game(Game.onePlayer, new XVIe());
			GameEngineGraphical g = new GameEngineGraphical(game);
			g.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
