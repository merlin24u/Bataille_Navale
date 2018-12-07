package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Game extends Remote {
	public int start() throws RemoteException;
	public Map getMap1(int playerId) throws RemoteException;
	public Map getMap2(int playerId) throws RemoteException;
	public void play(int playerId, int posX, int posY) throws RemoteException;
	public boolean isFinished() throws RemoteException;
}
