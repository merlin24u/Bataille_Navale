package view;

import java.awt.Color;
import java.awt.Graphics;
import controller.MapController;
import model.Map;

public class ViewOpponentMap extends ViewMap {

	private MapController controller;

	public ViewOpponentMap(Map m) {
		super(m);
		controller = new MapController();
		this.addMouseListener(controller);
	}

	@Override
	public void draw(Graphics g) {
		System.out.println("Oppenent");
		int[][] grid = map.getGrid();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == Map.MISSED) {
					g.setColor(Color.BLUE);
					g.fillOval(i * ViewMap.SCALE, j * ViewMap.SCALE, ViewMap.SCALE, ViewMap.SCALE);
				} else if (grid[i][j] == Map.SHOT) {
					g.setColor(Color.RED);
					g.fillOval(i * ViewMap.SCALE, j * ViewMap.SCALE, ViewMap.SCALE, ViewMap.SCALE);
				}
			}
		}
	}

	public MapController getController() {
		return controller;
	}
}
