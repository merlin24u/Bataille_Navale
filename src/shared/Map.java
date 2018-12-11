package shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import server.model.GameImpl;

public class Map implements Serializable {
	public static final int MISSED = -1;
	public static final int SHOT = 1;
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
			b = GameImpl.epoque.getBoat2Cases();
			do {
				posX = (int) (Math.random() * (SIZE - 1));
				posY = (int) (Math.random() * (SIZE - 1));
				vert = (int) Math.round(Math.random());
				if (vert == 1)
					b.setVertical();
				b.setPos(posX, posY);
			} while (!checkPosition(b));
			listBoat.add(b);
		}

		for (int i = 0; i < 1; i++) {
			b = GameImpl.epoque.getBoat4Cases();
			do {
				posX = (int) (Math.random() * (SIZE - 1));
				posY = (int) (Math.random() * (SIZE - 1));
				vert = (int) Math.round(Math.random());
				if (vert == 1)
					b.setVertical();
				b.setPos(posX, posY);
			} while (!checkPosition(b));
			listBoat.add(b);
		}
	}

	public void attack(int x, int y) {
		if (grid[x][y] == 0) {
			boolean shot = false;
			for (Boat b : listBoat) {
				if (b.isAlive() && b.isShot(x, y)) {
					shot = true;
					break;
				}
			}

			if (shot) {
				grid[x][y] = SHOT;
			} else {
				grid[x][y] = MISSED;
				nbMissedShot++;

			}
		}
	}

	public boolean allBoatDestroyed() {
		for (Boat b : listBoat) {
			if (b.isAlive())
				return false;
		}

		return true;
	}

	public boolean checkPosition(Boat b) {
		for (Boat boat : listBoat) {
			if (!boat.checkPosition(b))
				return false;
		}

		return true;
	}

	public List<Boat> getBoats() {
		return this.listBoat;
	}

	public int[][] getGrid() {
		return grid;
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
