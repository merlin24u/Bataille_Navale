package server.model;

import shared.Map;

public class Human extends Player {

	private boolean play;
	public Human(Map map1, Map map2) {
		super(map1, map2);
		this.play = false;
	}

	@Override
	public void play() {
		this.play = true;
	}
	
	public boolean canPlay() {
		return this.play;
	}
	
	public void endPlay() {
		this.play = false;
	}

}
