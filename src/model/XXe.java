package model;

public class XXe implements Epoque {

	@Override
	public Boat getBoat4Cases() {
		return new Boat("cruiser", 2, 4);
	}

	@Override
	public Boat getBoat2Cases() {
		return new Boat("patrolShip", 1, 2);
	}
}
