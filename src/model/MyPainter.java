package model;

import java.awt.image.BufferedImage;

import view.ViewOpponentMap;
import view.ViewPlayerMap;

import engine.GamePainter;

public class MyPainter implements GamePainter {

	public static int WIDTH;
	public static int HEIGHT;
	public static int scale = 50;

	public MyPainter(Map map1, Map map2) {
		HEIGHT = map1.getSize() * scale;
		WIDTH = (2 * HEIGHT);
		map1.addObserver(new ViewPlayerMap());
		map2.addObserver(new ViewOpponentMap());

	}

	@Override
	public void draw(BufferedImage image) {
		// not implemented
	}

	@Override
	public int getWidth() {
		return WIDTH;
	}

	@Override
	public int getHeight() {
		return HEIGHT;
	}

}
