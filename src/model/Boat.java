package model;

public class Boat {

	private int life;
	private String name;
	private int posX, posY;
	private int nbCases;
	private boolean vertical;

	public Boat() {

	}

	public void takeDamage() {

	}

	public boolean isAlive() {
		return (life > 0);
	}

}
