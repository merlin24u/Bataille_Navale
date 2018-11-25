package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controller.MapController;
import model.Map;

public abstract class ViewMap extends JPanel implements Observer {

	public static int SCALE = 50;
	protected Map map;

	protected ViewMap(Map m) {
		map = m;
		int size = Map.SIZE;
		this.setPreferredSize(new Dimension(size * ViewMap.SCALE, size * ViewMap.SCALE));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public abstract void draw(Graphics g);

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);

		drawGrid(g);
		draw(g);
		// System.out.println(map);
	}

	private void drawGrid(Graphics g) {
		for (int i = 1; i < Map.SIZE; i++) {
			g.setColor(Color.BLUE);
			g.drawLine(i * ViewMap.SCALE, 0, i * ViewMap.SCALE, this.getHeight());
			g.drawLine(0, i * ViewMap.SCALE, this.getWidth(), i * ViewMap.SCALE);
		}
	}
}
