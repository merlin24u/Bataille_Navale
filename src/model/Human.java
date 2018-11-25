package model;

import java.awt.Point;
import controller.MapController;

public class Human extends Player {

	private MapController controller;

	public Human(Map map1, Map map2, MapController mapController) {
		super(map1, map2);
		controller = mapController;
	}

	@Override
	public void play() {
		controller.setEnabled(true);
		Point move = null;

		try {
			move = controller.getMove();
			super.getOpponentMap().attack(move.x, move.y);
			controller.setEnabled(false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public MapController getController() {
		return controller;
	}

}
