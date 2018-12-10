package server.start;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import server.model.Epoque;
import server.model.GameImpl;
import server.model.XVIe;
import server.model.XXe;
import shared.Boat;
import shared.Game;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("Constructing server	implementation...");
			int mode = Integer.parseInt(args[0]);
			Epoque epoque;

			switch (mode) {
			case GameImpl.onePlayer:
				break;
			case GameImpl.twoPlayer:
				break;
			default:
				mode = GameImpl.onePlayer;
			}

			switch (args[1]) {
			case "XXe":
				epoque = new XXe();
				break;
			case "XVIe":
				epoque = new XVIe();
				break;
			default:
				epoque = new XXe();
			}

			Game game = new GameImpl(mode, epoque);

			System.out.println("Binding	server implementation to registry...");
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Bataille_Navale", game);

			System.out.println("Waiting	for	invocations	from clients...");

		} catch (RemoteException | AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
