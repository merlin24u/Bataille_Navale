package dao;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import shared.Game;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GameXmlDAO implements GameDAO {

	private static GameXmlDAO instance = null;

	private GameXmlDAO() {
	}

	@Override
	public Game load(String f) throws Exception {
		return null;
	}

	@Override
	public void save(Game game) {
		// not implemened
	}

	public static GameXmlDAO getInstance() {
		if (instance == null) {
			instance = new GameXmlDAO();
		}
		return instance;
	}

}
