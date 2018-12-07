package client.view;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import client.controller.MapController;
import client.model.MapModel;
import client.texture.TextureFactory;
import shared.Boat;
import shared.Map;

public class ViewPlayerMap extends ViewMap {

	public ViewPlayerMap(MapModel m) {
		super(m);
	}

	public void draw(Graphics g) {
		for (Boat b : map.getBoats()) {
			try {
				if (b.isAlive()) {
					int nbCases = b.getNbCases() * ViewMap.SCALE;
					int xb = b.getPosX() * ViewMap.SCALE;
					int yb = b.getPosY() * ViewMap.SCALE;

					if (b.isVertical())
						g.drawImage(TextureFactory.getInstance().getTexture(b.getName()), xb, yb, ViewMap.SCALE,
								nbCases, null);
					else
						g.drawImage(TextureFactory.getInstance().getTexture(b.getName() + "_Hor"), xb, yb, nbCases,
								ViewMap.SCALE, null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
