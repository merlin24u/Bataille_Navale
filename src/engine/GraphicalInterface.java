package engine;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Game;

public class GraphicalInterface {

	private JPanel pane;

	public GraphicalInterface(Game g) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane = new JPanel();
		pane.setLayout(new BorderLayout());
		pane.add(g.getViewMap1(), BorderLayout.EAST);
		pane.add(g.getViewMap2(), BorderLayout.WEST);
	
		f.setContentPane(pane);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
		
		f.setLocationRelativeTo(null);
		
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

}