package client.start;

import java.awt.Point;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import client.controller.MapController;
import client.model.MapModel;
import client.view.GraphicalInterface;
import client.view.ViewMap;
import client.view.ViewPlayerMap;
import shared.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Registry registry= LocateRegistry.getRegistry();
			System.out.print("RMI	registry bindings:	");
			String[] r = registry.list();
			for (int i=0; i<r.length; i++)
				System.out.println(r[i]);
			String remoteObjectName = "Bataille_Navale";
			
			Game game = (Game)registry.lookup (remoteObjectName);
			
			int id = game.start();
			System.out.println(id);
			MapModel myMap = new MapModel(game.getMap1(id));
			MapModel oppMap = new MapModel(game.getMap2(id));
			MapController mapController = new MapController();
			
			GraphicalInterface gi = new GraphicalInterface(myMap, oppMap, mapController);
			
			
			
			while (!game.isFinished()) {
				myMap.setMap(game.getMap1(id));
				oppMap.setMap(game.getMap2(id));
				Point move = mapController.getMove();
				while (move.getX() < 0) {
					move = mapController.getMove();
				}
				System.out.println("play x="+move.x+" y="+move.y);
				game.play(id, move.x, move.y);
				mapController.resetMove();
				
				
				
				Thread.sleep(1000);
				
			}
			
			System.out.println("Game Finished !");
			
		} catch (RemoteException | NotBoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
