package controller;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.ViewMap;

public class MapController implements MouseListener {

	private boolean enabled;
	private Point move;

	public MapController() {
		enabled = false;
		move = new Point(-1, -1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (enabled) {
			synchronized (move) {
				move.setLocation(e.getX() / ViewMap.SCALE, e.getY() / ViewMap.SCALE);
				move.notify();
			}
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

	public void setEnabled(boolean b) {
		enabled = b;
		if (!enabled)
			move.x = -1;
	}

	public Point getMove() throws InterruptedException {
		if (move.x == -1) {
			synchronized (move) {
				move.wait();
			}
		}
		return move;
	}
}
