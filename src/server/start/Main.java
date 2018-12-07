package server.start;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import server.model.Epoque;
import server.model.GameImpl;
import server.model.XVIe;
import shared.Boat;
import shared.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Constructing	server	implementation...");
			Game game = new GameImpl(GameImpl.twoPlayer, new XVIe());
			
			System.out.println("Binding	server	implementation	to	registry...");
			Registry	registry= LocateRegistry.getRegistry();
			registry.bind("Bataille_Navale", game);
			
			System.out.println("Waiting	for	invocations	from	clients...");
			
			
			
		} catch (RemoteException | AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
