package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import javax.swing.BorderFactory;

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
	}
}
