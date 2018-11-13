package engine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private GamePainter painter;

	private BufferedImage currentImage;

	private int width, height;

	public DrawingPanel(GamePainter painter) {
		super();
		this.width = painter.getWidth();
		this.height = painter.getHeight();
		this.setPreferredSize(new Dimension(this.width, this.height));
		this.painter = painter;

		this.currentImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
	}

	public void drawGame() {
		// generer l'image
		this.painter.draw(this.currentImage);

		// met a jour l'image a afficher sur le panel
		this.repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(this.currentImage, 0, 0, getWidth(), getHeight(), 0, 0,
				getWidth(), getHeight(), null);
	}

}