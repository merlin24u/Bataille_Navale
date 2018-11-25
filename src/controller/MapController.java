package controller;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.ViewMap;

public class MapController implements MouseListener {

	private static boolean enabled;
	private static Point move;

	public MapController() {
		enabled = false;
		move = new Point(-1, -1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (enabled) {
			System.out.println(e.getX() / ViewMap.SCALE + " " + e.getY() / ViewMap.SCALE);
			move.setLocation(e.getX() / ViewMap.SCALE, e.getY() / ViewMap.SCALE);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void setEnabled(boolean b) {
		enabled = b;
		if (!enabled)
			move.setLocation(-1, -1);
	}

	public static Point getMove() {
		return move;
	}
}
