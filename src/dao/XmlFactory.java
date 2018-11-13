package dao;

public class XmlFactory extends AbstractDAOFactory {

	private static XmlFactory instance = null;

	private XmlFactory() {
	}

	@Override
	public GameDAO getMapDAO() {
		return GameXmlDAO.getInstance();
	}

	public static XmlFactory getInstance() {
		if (instance == null)
			instance = new XmlFactory();
		return instance;
	}
}
