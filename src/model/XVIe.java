package model;

public class XVIe implements Epoque {

	@Override
	public Boat getBoat4Cases() {
		return new Boat("galion", 1, 4);
	}

	@Override
	public Boat getBoat2Cases() {
		return new Boat("caravelle", 1, 2);
	}
}
