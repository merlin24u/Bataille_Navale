package client.view;

import java.awt.Graphics;

import client.controller.MapController;
import client.model.MapModel;
import shared.Map;

public class ViewOpponentMap extends ViewMap {

	private MapController controller;

	public ViewOpponentMap(MapModel m, MapController c) {
		super(m);
		controller = c;
		this.addMouseListener(controller);
	}

	@Override
	public void draw(Graphics g) {
		// ne fait rien
	}

	public MapController getController() {
		return controller;
	}
}
