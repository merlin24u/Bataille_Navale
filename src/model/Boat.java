package model;

public class Boat {

	private int life;
	private String name;
	private int posX, posY;
	private int nbCases;
	private boolean vertical;

	public Boat(String name, int life, int nbCases) {
		this.name = name;
		this.life = life;
		this.nbCases = nbCases;
		this.posX = -1;
		this.posY = -1;
	}

	/**
	 * Place le bateau, si le bateau depasse de la grille ou est placé en dehors, il
	 * est placé à la position la plus proche correct
	 * 
	 * @param x
	 * @param y
	 */
	public void setPos(int x, int y) {

		if (x >= Map.SIZE) {
			x = Map.SIZE - 1;
		}
		if (x < 0) {
			x = 0;
		}
		if (y >= Map.SIZE) {
			y = Map.SIZE - 1;
		}
		if (y < 0) {
			y = 0;
		}
		if (!vertical && Map.SIZE - (x + nbCases) < 0)
			x = Map.SIZE - nbCases;
		if (vertical && Map.SIZE - (y + nbCases) < 0)
			y = Map.SIZE - nbCases;

		this.posX = x;
		this.posY = y;
	}

	/**
	 * indique si le bateu est placé sur la carte
	 * 
	 * @return true si le bateau à une position negative false sinon
	 */
	public boolean isPlaced() {
		return this.posX < 0 || this.posY < 0;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	public void takeDamage() {

	}

	public boolean isAlive() {
		return (life > 0);
	}

}
