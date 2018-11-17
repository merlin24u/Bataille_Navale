package view;

import java.awt.Dimension;
import java.util.Observable;
import com.sun.prism.Graphics;
import model.Map;

public class ViewOpponentMap extends ViewMap {

	public ViewOpponentMap(Map m) {
		int size = m.getSize();
		this.setPreferredSize(new Dimension(size * ViewMap.SCALE, size * ViewMap.SCALE));
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

	public void paint(Graphics g) {

	}
}
