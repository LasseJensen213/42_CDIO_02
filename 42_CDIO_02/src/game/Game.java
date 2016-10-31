package game;

import java.util.Scanner;

public class Game {


	private int numOfPlayers = 2;
	private int numOfDice = 2;
	private int numOfDiceSides = 6;
	private int playerNum = 1;
	 

	public void play()
	{
		//Lets go
		int turn = 0;
		int[] fieldPos = new int[numOfPlayers];
		for(int i = 0; i<numOfPlayers;i++)
		{
			fieldPos[i]=0;
		}
		DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);
		PlayerManager pMan = new PlayerManager(numOfPlayers);
		
		
	}

	


}
