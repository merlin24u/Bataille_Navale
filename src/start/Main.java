package start;

import engine.GameEngineGraphical;
import model.Game;
import model.XVIe;
import model.XXe;

public class Main {

	public static void main(String[] args) {
		try {
			Game game = new Game(Game.onePlayer, new XXe());
			GameEngineGraphical g = new GameEngineGraphical(game);
			g.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
