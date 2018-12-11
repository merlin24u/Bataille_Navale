package client.start;

import java.awt.Point;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import client.controller.MapController;
import client.model.MapModel;
import client.view.GraphicalInterface;
import shared.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Registry registry = LocateRegistry.getRegistry();
			System.out.print("RMI	registry bindings:	");
			String[] r = registry.list();
			for (int i = 0; i < r.length; i++)
				System.out.println(r[i]);
			String remoteObjectName = "Bataille_Navale";

			Game game = (Game) registry.lookup(remoteObjectName);

			int id = game.start();
			System.out.println(id);
			MapModel myMap = new MapModel(game.getMap1(id));
			MapModel oppMap = new MapModel(game.getMap2(id));
			MapController mapController = new MapController();

			GraphicalInterface gi = new GraphicalInterface(myMap, oppMap,
					mapController, id);

			while (!game.isFinished()) {
				myMap.setMap(game.getMap1(id));
				oppMap.setMap(game.getMap2(id));
				Point move = mapController.getMove();
				if (move.getX() >= 0) {
					move = mapController.getMove();
					game.play(id, move.x, move.y);
					System.out.println("play x=" + move.x + " y=" + move.y);
					mapController.resetMove();
				}
				
				Thread.sleep(300);

			}
			myMap.setMap(game.getMap1(id));
			oppMap.setMap(game.getMap2(id));
			
			System.out.println("Game Finished !");
			System.out.println("The winner is the player"+(game.getWinner()+1));

		} catch (RemoteException | NotBoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
