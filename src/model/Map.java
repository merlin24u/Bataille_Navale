package model;

import java.util.ArrayList;
import java.util.Observable;

import view.ViewMap;
import view.ViewPlayerMap;

public class Map extends Observable {

	private int nbMissedShot;
	private int[][] grid;
	private ArrayList<Boat> listBoat;

	public Map() {
		grid = new int[10][10];
		listBoat = new ArrayList<>();
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

	public int getSize() {
		return grid.length;
	}
}
