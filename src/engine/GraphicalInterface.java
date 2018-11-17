package engine;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import model.Game;

public class GraphicalInterface {

	public GraphicalInterface(Game g) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setLayout(new BorderLayout());
		f.add(g.getViewMap1(), BorderLayout.SOUTH);
		f.add(g.getViewMap2(), BorderLayout.NORTH);

		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

	public void paint() {

	}

}