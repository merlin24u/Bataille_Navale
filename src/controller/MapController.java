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
	public synchronized void mouseClicked(MouseEvent e) {
		if (enabled) {
			move.setLocation(e.getX() / ViewMap.SCALE, e.getY() / ViewMap.SCALE);
			notify();
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

	public synchronized Point getMove() throws InterruptedException {
		while (move.x == -1)
			wait();

		return move;
	}
}
