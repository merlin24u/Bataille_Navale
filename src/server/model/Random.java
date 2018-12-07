package server.model;

import java.awt.Point;

import shared.Map;

public class Random implements ShootStrategy {

	@Override
	public Point shoot(Map m) {
		Point move = new Point();
		int posX, posY;

		do {
			posX = (int) (Math.random() * (Map.SIZE - 1));
			posY = (int) (Math.random() * (Map.SIZE - 1));
		} while (m.getGrid()[posX][posY] != 0);

		move.setLocation(posX, posY);
		return move;
	}

}
