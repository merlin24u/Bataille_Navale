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
		vertical = false;
	}

	/**
	 * Place le bateau, si le bateau dépasse de la grille, il est placé à la
	 * position la plus proche correct
	 * 
	 * @param x
	 * @param y
	 */
	public void setPos(int x, int y) {
		if (!vertical && Map.SIZE - (x + nbCases) < 0)
			x = Map.SIZE - nbCases;
		if (vertical && Map.SIZE - (y + nbCases) < 0)
			y = Map.SIZE - nbCases;

		posX = x;
		posY = y;
	}

	/**
	 * Indique si le bateu est placé sur la carte
	 * 
	 * @return true si le bateau à une position negative false sinon
	 */
	public boolean isPlaced() {
		return this.posX < 0 || this.posY < 0;
	}

	public void setVertical() {
		vertical = true;
	}

	public void takeDamage() {

	}

	public boolean isAlive() {
		return (life > 0);
	}

	public int getLife() {
		return life;
	}

	public String getName() {
		return name;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public boolean isVertical() {
		return vertical;
	}
	
	public int getNbCases() {
		return nbCases;
	}

	@Override
	public String toString() {
		return "Boat [life=" + life + ", name=" + name + ", posX=" + posX + ", posY=" + posY + ", nbCases=" + nbCases
				+ ", vertical=" + vertical + "]";
	}

}
