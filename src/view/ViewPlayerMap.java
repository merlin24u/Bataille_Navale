package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import javax.swing.BorderFactory;

import model.Boat;
import model.Map;

public class ViewPlayerMap extends ViewMap {

	private Map map;

	public ViewPlayerMap(Map m) {
		map = m;
		int size = Map.SIZE;
		this.setPreferredSize(new Dimension(size * ViewMap.SCALE, size * ViewMap.SCALE));

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		System.out.println(map);
		for (int i = 1; i < Map.SIZE ; i++) {
			g.setColor(Color.MAGENTA);
			g.drawLine(i*ViewMap.SCALE, 0, i*ViewMap.SCALE, this.getHeight());
			g.drawLine(0,i*ViewMap.SCALE,this.getWidth(), i*ViewMap.SCALE );
		}
		
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
