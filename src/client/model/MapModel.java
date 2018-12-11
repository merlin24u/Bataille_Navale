package client.model;

import java.util.List;
import java.util.Observable;
import shared.Boat;
import shared.Map;

public class MapModel extends Observable {
	private Map map;

	public MapModel(Map map) {
		this.map = map;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
		this.setChanged();
		this.notifyObservers();
	}

	public int[][] getGrid() {
		return this.map.getGrid();
	}

	public List<Boat> getBoats() {
		return this.map.getBoats();
	}

}
