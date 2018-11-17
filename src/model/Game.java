package model;

import view.ViewMap;
import view.ViewOpponentMap;
import view.ViewPlayerMap;

public class Game {

	public static final int onePlayer = 1;
	public static final int twoPlayer = 2;
	private boolean finished;
	private int mode;
	private Player player1, player2;
	private ViewMap viewMap1, viewMap2;

	public Game(int m) {
		mode = m;
		finished = false;

		switch (mode) {
		case onePlayer:
			Map mapPlayer1 = new Map();
			viewMap1 = new ViewPlayerMap(mapPlayer1);
			mapPlayer1.addObserver(viewMap1);
			Map mapPlayer2 = new Map();
			viewMap2 = new ViewOpponentMap(mapPlayer2);
			mapPlayer2.addObserver(viewMap2);
			player1 = new Human(mapPlayer1, mapPlayer2);
			player2 = new Computer(mapPlayer2, mapPlayer1, new Random());
			break;
		case twoPlayer:
			break;
		}
	}

	public void evolve() {
		player1.play();
		player2.play();

		if (player1.isGameOver()) {
			System.out.println("Player 2 wins");
			finished = true;
		} else if (player2.isGameOver()) {
			System.out.println("Player 1 wins");
			finished = true;
		}
	}

	public boolean isFinished() {
		return finished;
	}

	public Map getMap1() {
		return player1.getMyMap();
	}

	public Map getMap2() {
		return player2.getMyMap();
	}

	public ViewMap getViewMap1() {
		return viewMap1;
	}

	public ViewMap getViewMap2() {
		return viewMap2;
	}

}
