package engine;

import java.awt.BorderLayout;
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
		pane.add(g.getViewMap1(), BorderLayout.SOUTH);
		pane.add(g.getViewMap2(), BorderLayout.NORTH);

		f.setContentPane(pane);
		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

}