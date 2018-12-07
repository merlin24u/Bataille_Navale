package dao;

import shared.Game;

public interface GameDAO {

	public Game load(String file) throws Exception;

	public void save(Game map);
}
