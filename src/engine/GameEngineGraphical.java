package engine;

import model.Game;

public class GameEngineGraphical {

	private Game game;

	private GamePainter gamePainter;

	private GraphicalInterface gui;

	public GameEngineGraphical(Game game, GamePainter gamePainter) {
		this.game = game;
		this.gamePainter = gamePainter;
	}

	public void run() throws InterruptedException {

		gui = new GraphicalInterface(this.gamePainter);
		gui.paint();

		while (!game.isFinished()) {
			game.evolve();
			Thread.sleep(100);
		}
	}

}