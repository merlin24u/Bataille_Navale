package client.texture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TextureFactory {

	public static TextureFactory instance;
	private BufferedImage cruiser, cruiser_Hor, patrolShip, patrolShip_Hor, galleon, galleon_Hor, caravel, caravel_Hor;
	private BufferedImage plouf, boom;

	private TextureFactory() throws IOException {
		cruiser = ImageIO.read(ResourceLoader.load("XXe/cruiser.png"));
		cruiser_Hor = ImageIO.read(ResourceLoader.load("XXe/cruiser_Hor.png"));
		patrolShip = ImageIO.read(ResourceLoader.load("XXe/patrolShip.png"));
		patrolShip_Hor = ImageIO.read(ResourceLoader.load("XXe/patrolShip_Hor.png"));
		galleon = ImageIO.read(ResourceLoader.load("XVIe/galleon.png"));
		galleon_Hor = ImageIO.read(ResourceLoader.load("XVIe/galleon_Hor.png"));
		caravel = ImageIO.read(ResourceLoader.load("XVIe/caravel.png"));
		caravel_Hor = ImageIO.read(ResourceLoader.load("XVIe/caravel_Hor.png"));
		plouf = ImageIO.read(ResourceLoader.load("img/plouf.png"));
		boom = ImageIO.read(ResourceLoader.load("img/boom.png"));
	}

	public BufferedImage getTexture(String texture) throws Exception {
		switch (texture) {
		case "cruiser":
			return cruiser;
		case "cruiser_Hor":
			return cruiser_Hor;
		case "patrolShip":
			return patrolShip;
		case "patrolShip_Hor":
			return patrolShip_Hor;
		case "galleon":
			return galleon;
		case "galleon_Hor":
			return galleon_Hor;
		case "caravel":
			return caravel;
		case "caravel_Hor":
			return caravel_Hor;
		case "plouf":
			return plouf;
		case "boom":
			return boom;
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
