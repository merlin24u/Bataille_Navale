package engine;

import javax.swing.JFrame;

public class GraphicalInterface {

	private DrawingPanel panel;

	public GraphicalInterface(GamePainter gamePainter) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// attacher le panel contenant l'afficheur du game
		this.panel = new DrawingPanel(gamePainter);
		f.setContentPane(this.panel);

		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}

	public void paint() {
		panel.drawGame();
	}

}