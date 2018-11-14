package engine;

import model.Game;

public class GameEngineGraphical {

	private Game game;

	private GraphicalInterface gui;

	public GameEngineGraphical(Game game) {
		this.game = game;
	}

	public void run() throws InterruptedException {

		gui = new GraphicalInterface();
		gui.paint();

		while (!game.isFinished()) {
			game.evolve();
			Thread.sleep(100);
		}
	}

}