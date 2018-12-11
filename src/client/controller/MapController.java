package client.controller;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import client.view.ViewMap;

public class MapController implements MouseListener {

	private Point move;

	public MapController() {
		this.move = new Point(-1, -1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.setMove(new Point(e.getX() / ViewMap.SCALE, e.getY() / ViewMap.SCALE));
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

	public Point getMove() {
		return this.move;
	}

	public void setMove(Point move) {
		this.move = move;
	}

	public void resetMove() {
		this.move.x = -1;
		this.move.y = -1;
	}
}
