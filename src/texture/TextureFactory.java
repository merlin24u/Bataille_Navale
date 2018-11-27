package texture;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TextureFactory {

	public static TextureFactory instance;
	private Image cruiser, cruiser_Hor, patrolShip, patrolShip_Hor;

	private TextureFactory() throws IOException {
		cruiser = ImageIO.read(new File("res/XXe/cruiser.png"));
		cruiser_Hor = ImageIO.read(new File("res/XXe/cruiser_Hor.png"));
		patrolShip = ImageIO.read(new File("res/XXe/patrolShip.png"));
		patrolShip_Hor = ImageIO.read(new File("res/XXe/patrolShip_Hor.png"));
	}

	public Image getTexture(String texture) throws Exception {
		switch (texture) {
		case "cruiser":
			return cruiser;
		case "cruiser_Hor":
			return cruiser_Hor;
		case "patrolShip":
			return patrolShip;
		case "patrolShip_Hor":
			return patrolShip_Hor;
		default:
			throw new Exception("not implemented");
		}
	}

	public synchronized static TextureFactory getInstance() throws IOException {
		if (instance == null)
			instance = new TextureFactory();

		return instance;
	}

}
