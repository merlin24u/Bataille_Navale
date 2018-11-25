package model;

import java.awt.Point;
import controller.MapController;

public class Human extends Player {

	public Human(Map map1, Map map2) {
		super(map1, map2);
	}

	@Override
	public void play() {
		MapController.setEnabled(true);
		Point move = null;

		try {
			move = MapController.getMove();
			super.getOpponentMap().attack(move.x, move.y);
			MapController.setEnabled(false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
