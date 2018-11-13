package model;

public class Computer extends Player {

	private ShootStrategy strat;

	public Computer(Map map1, Map map2, ShootStrategy s) {
		super(map1, map2);
		strat = s;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
	}

}
