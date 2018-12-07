package client.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import client.controller.MapController;
import client.model.MapModel;
import shared.Game;

public class GraphicalInterface {

	private JPanel pane;

	public GraphicalInterface(MapModel myMap, MapModel oppenentMap, MapController c) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane = new JPanel();
		pane.setLayout(new BorderLayout());
		pane.add(new ViewPlayerMap(myMap), BorderLayout.EAST);
		pane.add(new ViewOpponentMap(oppenentMap, c), BorderLayout.WEST);
	
		f.setContentPane(pane);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
		
		f.setLocationRelativeTo(null);
		
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

}
