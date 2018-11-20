package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import javax.swing.BorderFactory;
import model.Map;

public class ViewOpponentMap extends ViewMap {

	public ViewOpponentMap(Map m) {
		super(m);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("Oppenent");
	}

	
}
