package server.model;

import java.awt.Point;

import shared.Map;

public class Computer extends Player {

	private ShootStrategy strat;

	public Computer(Map map1, Map map2, ShootStrategy s) {
		super(map1, map2);
		strat = s;
	}

	@Override
	public void play() {
		Point move = strat.shoot(super.getOpponentMap());
		super.getOpponentMap().attack(move.x, move.y);
	}

}
