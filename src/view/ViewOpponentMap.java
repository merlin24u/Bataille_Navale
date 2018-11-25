package view;

import java.awt.Graphics;

import controller.MapController;
import model.Map;

public class ViewOpponentMap extends ViewMap {

	public ViewOpponentMap(Map m) {
		super(m);
		this.addMouseListener(new MapController());
	}

	@Override
	public void draw(Graphics g) {
		System.out.println("Oppenent");
	}
}
