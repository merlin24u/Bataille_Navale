package model;

import java.util.ArrayList;
import java.util.Observable;

public class Map extends Observable {
	public static final int SIZE = 10;
	private int nbMissedShot;
	private int[][] grid;
	private ArrayList<Boat> listBoat;

	public Map() {
		grid = new int[SIZE][SIZE];
		listBoat = new ArrayList<>();
	}

	public void attack(int x, int y) {

	}

	/**
	 * Place le bateau à l'indice i à la pos x y
	 * 
	 * @param i
	 *            indice dans la liste listBoat
	 * @param x
	 *            pos x
	 * @param y
	 *            pos y
	 */
	public void placer(int i, int x, int y) {
		this.listBoat.get(i).setPos(x, y);
	}

	public boolean allBoatDestroyed() {
		for (Boat b : listBoat) {
			if (b.isAlive())
				return false;
		}

		return true;
	}

	public int getSize() {
		return grid.length;
	}
}
