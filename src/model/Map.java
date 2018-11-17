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
		int posX, posY, vert;
		Boat b;

		for (int i = 0; i < 2; i++) {
			posX = (int) (Math.random() * (SIZE - 1));
			posY = (int) (Math.random() * (SIZE - 1));
			vert = (int) (Math.random() * 1);
			b = Game.epoque.getBoat2Cases();
			if (vert == 1)
				b.setVertical();
			b.setPos(posX, posY);
			listBoat.add(b);
		}

		posX = (int) (Math.random() * (SIZE - 1));
		posY = (int) (Math.random() * (SIZE - 1));
		vert = (int) (Math.random() * 1);
		b = Game.epoque.getBoat4Cases();
		if (vert == 1)
			b.setVertical();
		b.setPos(posX, posY);
		listBoat.add(b);
	}

	public void attack(int x, int y) {

	}

	public boolean allBoatDestroyed() {
		for (Boat b : listBoat) {
			if (b.isAlive())
				return false;
		}

		return true;
	}

	public void update() {
		setChanged();
		this.notifyObservers();
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		for (Boat b : listBoat) {
			str.append(b);
		}

		return str.toString();
	}

}
