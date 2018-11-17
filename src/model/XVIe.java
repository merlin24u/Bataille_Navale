package model;

public class XVIe implements Epoque {

	@Override
	public Boat getBoat4Cases() {
		return new Boat("Galion", 1, 4);
	}

	@Override
	public Boat getBoat2Cases() {
		return new Boat("Caravelle", 1, 2);
	}

}
