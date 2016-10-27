package game;

import java.util.Scanner;

public class Game {


	private int numOfPlayers = 2;
	private int numOfDice = 2;
	private int numOfDiceSides = 6;
	private int nFields = 11;


	public void play()
	{
		//Lets go
		DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);
		PlayerManager pMan = new PlayerManager(numOfPlayers);
		Scanner keyb = new Scanner(System.in);
		int[] playerPos = new int[numOfPlayers];
		int[] fieldEffect = {250,-100,100,-20,180,0,-70,60,-80,-50,650};
		String input;
		boolean noWinner = true;
		int diceResult;
		int turn = 0;

		for(int i = 0; i<numOfPlayers;i++)
		{
			playerPos[i]=0;
		}



		while(noWinner)
		{
			System.out.println(pMan.get(turn).getName()+" "
					+StringBank.getCharacterName(pMan.get(turn).getGameCharacter())
					+" "+pMan.get(turn).accesAccount().getBalance());

			input = keyb.nextLine();
			diceCup.rollDice();
			diceResult = diceCup.getDiceTotal();
			playerPos[turn]=(playerPos[turn]+diceResult)%nFields;
			StringBank.randomizer();
			System.out.println(StringBank.getBoardMessage(playerPos[turn],pMan.get(turn).getGameCharacter()));
			pMan.get(turn).accesAccount().deposit(fieldEffect[playerPos[turn]]);

			if(pMan.get(turn).accesAccount().getBalance()>=3000)
			{
				noWinner = false;
			}

			turn += playerPos[turn]==8?0:1;
			if(turn == numOfPlayers)
			{
				turn = 0;
			}


		}
	}




}
