package engine;

import model.Game;

public class GameEngineGraphical {

	private Game game;

	private GraphicalInterface gui;

	private static int timeIter = 1000 / 25;

	public GameEngineGraphical(Game game) {
		this.game = game;
	}

	public void run() throws InterruptedException {

		long tDeb, tFin;
		gui = new GraphicalInterface(game);

		while (!game.isFinished()) {
			tDeb = System.currentTimeMillis();
			game.evolve();
			gui.paint();
			tFin = System.currentTimeMillis();
			Thread.sleep(timeIter - (tDeb - tFin));
		}
	}

}