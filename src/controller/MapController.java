package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.ViewMap;

public class MapController implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()/ViewMap.SCALE + " " + e.getY()/ViewMap.SCALE);
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

}
