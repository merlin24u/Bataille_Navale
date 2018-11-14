package engine;

import javax.swing.JFrame;

public class GraphicalInterface {

	public GraphicalInterface() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

	public void paint() {
	}

}