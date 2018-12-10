package server.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import shared.Game;
import shared.Map;

public class GameImpl extends UnicastRemoteObject implements Game{

	public static final int onePlayer = 1;
	public static final int twoPlayer = 2;
	private boolean finished;
	private int mode;
	private Player[] players;
	
	
	private boolean playerOneConnected;
	
	//private ViewMap viewMap1, viewMap2;
	public static Epoque epoque;

	public GameImpl(int m, Epoque e) throws RemoteException {
		this.players = new Player[2];
		this.mode = m;
		this.epoque = e;
		this.finished = false;
		this.playerOneConnected = false;
		
		
		Map mapPlayer1 = new Map();
		Map mapPlayer2 = new Map();
		this.players[0] = new Human(mapPlayer1, mapPlayer2);
		switch (mode) {
		case onePlayer:
			
//			Map mapPlayer1 = new Map();
//			viewMap1 = new ViewPlayerMap(mapPlayer1);
//			mapPlayer1.addObserver(viewMap1);
//			mapPlayer1.update();

//			Map mapPlayer2 = new Map();
//			viewMap2 = new ViewOpponentMap(mapPlayer2);
//			mapPlayer2.addObserver(viewMap2);
//			mapPlayer2.update();

			
			players[1] = new Computer(mapPlayer2, mapPlayer1, new Random());
			break;
		case twoPlayer:
	
			players[1] = new Human(mapPlayer2, mapPlayer1);
			break;
		}
		players[0].play();
	}

//	public void evolve() {
//		players[0].play();
//		players[1].play();
//
//		if (players[0].isGameOver()) {
//			System.out.println("Player 2 wins");
//			finished = true;
//		} else if (players[1].isGameOver()) {
//			System.out.println("Player 1 wins");
//			finished = true;
//		}
//	}

	public boolean isFinished() throws RemoteException {
		return finished;
	}

	public Map getMap1(int playerId) throws RemoteException {
		return this.players[playerId].getMyMap();
	}

	public Map getMap2(int playerId) throws RemoteException {
		return this.players[playerId].getOpponentMap();
	}

	/**
	 * Methode qui retourne l'id du joueur
	 * @return 0 si on n'est pas dans le mode 2 joueurs ou que l'id n'a pas déjàs été donné, 1 sinon
	 */
	@Override
	public int start() throws RemoteException {
		if (mode != twoPlayer || !playerOneConnected) {
			playerOneConnected = true;
			return 0;
		}
		return 1;
	}

	@Override
	public void play(int playerId, int posX, int posY) throws RemoteException {
		// TODO Auto-generated method stub
		Human human = (Human)players[playerId];
		System.out.println("player"+playerId + " play x="+posX+" y="+posY);
		System.out.println("canPlay:" + human.canPlay());
		if (human.canPlay()) {
			human.getOpponentMap().attack(posX, posY);
			human.endPlay();
			
			if (playerId == 0 ) {
				players[1].play();
			}
			else {
				players[0].play();
			}
			
			if(mode == onePlayer) {
				players[playerId].play();
			}
			
			finished = players[0].isGameOver() || players[1].isGameOver();
		}
		
	}

	@Override
	public int getWinner() throws RemoteException {
		// TODO Auto-generated method stub
		if (players[0].isGameOver())
			return 1;
		if (players[1].isGameOver())
			return 0;
		return -1;
	}

//	public ViewMap getViewMap1() {
//		return viewMap1;
//	}
//
//	public ViewMap getViewMap2() {
//		return viewMap2;
//	}

}
