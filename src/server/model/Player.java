package server.model;

import shared.Map;

public abstract class Player {

	private Map myMap, opponentMap;

	public Player(Map map1, Map map2) {
		myMap = map1;
		opponentMap = map2;
	}

	public abstract void play();

	public boolean isGameOver() {
		return myMap.allBoatDestroyed();
	}

	public Map getMyMap() {
		return myMap;
	}

	public Map getOpponentMap() {
		return opponentMap;
	}
}
