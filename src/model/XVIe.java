package model;

public class XVIe implements Epoque {

	@Override
	public Boat getBoat4Cases() {
		return new Boat("galleon", 1, 4);
	}

	@Override
	public Boat getBoat2Cases() {
		return new Boat("caravel", 1, 2);
	}
}
