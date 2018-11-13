package start;

import model.Game;

public class Main {

	public static void main(String[] args) {
		Game game = new Game(Game.onePlayer);
		while (!game.isFinished()) {
			game.evolve();
		}
	}
}
