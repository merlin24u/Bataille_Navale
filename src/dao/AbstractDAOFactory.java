package dao;

public abstract class AbstractDAOFactory {

	public final static int XML = 1;

	public abstract GameDAO getMapDAO();

	public static AbstractDAOFactory getAbstractDAOFactory(int type) throws Exception {
		switch (type) {
		case XML:
			return XmlFactory.getInstance();
		default:
			throw new Exception();
		}

	}
}
