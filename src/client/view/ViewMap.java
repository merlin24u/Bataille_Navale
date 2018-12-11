package client.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import client.controller.MapController;
import client.model.MapModel;
import client.texture.*;
import shared.Map;

public abstract class ViewMap extends JPanel implements Observer {

	public static int SCALE = 50;
	protected MapModel map;

	protected ViewMap(MapModel m) {
		map = m;
		int size = Map.SIZE;
		m.addObserver(this);
		this.setBackground(new Color(0, 145, 225));
		this.setPreferredSize(new Dimension(size * ViewMap.SCALE, size
				* ViewMap.SCALE));
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
		drawShot(g);
	}

	private void drawGrid(Graphics g) {
		for (int i = 1; i < Map.SIZE; i++) {
			g.setColor(new Color(0, 100, 120));
			g.drawLine(i * ViewMap.SCALE, 0, i * ViewMap.SCALE,
					this.getHeight());
			g.drawLine(0, i * ViewMap.SCALE, this.getWidth(), i * ViewMap.SCALE);
		}
	}

	private void drawShot(Graphics g) {
		try{
			int[][] grid = map.getGrid();
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid.length; j++) {
					int x,y;
					if (grid[i][j] == Map.MISSED) {
						x = (i*ViewMap.SCALE)+(ViewMap.SCALE/8);
						y = j*ViewMap.SCALE+ (ViewMap.SCALE/8);
						g.drawImage(TextureFactory.getInstance().getTexture("plouf"), x, y, 3*ViewMap.SCALE/4,
						3*ViewMap.SCALE/4, null);
//						g.setColor(Color.BLUE);
//						g.fillOval(i * ViewMap.SCALE, j * ViewMap.SCALE,
//								ViewMap.SCALE, ViewMap.SCALE);
					} else if (grid[i][j] == Map.SHOT) {
//						g.setColor(Color.RED);
//						g.fillOval(i * ViewMap.SCALE, j * ViewMap.SCALE,
//								ViewMap.SCALE, ViewMap.SCALE);
						x = i*ViewMap.SCALE;
						y = j*ViewMap.SCALE;
						g.drawImage(TextureFactory.getInstance().getTexture("boom"), x, y, ViewMap.SCALE,ViewMap.SCALE, null);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
