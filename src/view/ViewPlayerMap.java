package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import javax.swing.BorderFactory;

import model.Boat;
import model.Map;

public class ViewPlayerMap extends ViewMap {

	public ViewPlayerMap(Map m) {
		super(m);
	}

	
	
	public void draw(Graphics g) {
		System.out.println("Player");
		for (Boat b  : map.getBoats()) {
			int nbCases = b.getNbCases()*ViewMap.SCALE;
			int xb = b.getPosX()*ViewMap.SCALE;
			int yb = b.getPosY()*ViewMap.SCALE;
			
			if (b.isVertical())
				g.fillRect(xb, yb, ViewMap.SCALE, nbCases);
			else
				g.fillRect(xb, yb, nbCases, ViewMap.SCALE);
		}
	}
}
