package view;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import texture.TextureFactory;
import model.Boat;
import model.Map;

public class ViewPlayerMap extends ViewMap {

	public ViewPlayerMap(Map m) {
		super(m);
	}

	public void draw(Graphics g) {
		System.out.println("Player");

		for (Boat b : map.getBoats()) {
			try {
				if (b.isAlive()) {
					int nbCases = b.getNbCases() * ViewMap.SCALE;
					int xb = b.getPosX() * ViewMap.SCALE;
					int yb = b.getPosY() * ViewMap.SCALE;

					if (b.isVertical())
						g.drawImage(
								TextureFactory.getInstance().getTexture(
										b.getName()), xb, yb, ViewMap.SCALE,
								nbCases, null);
					else
						g.drawImage(
								TextureFactory.getInstance().getTexture(
										b.getName() + "_Hor"), xb, yb, nbCases,
								ViewMap.SCALE, null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
