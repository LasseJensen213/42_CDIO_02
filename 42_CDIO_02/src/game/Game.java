package game;

import java.awt.Color;
import java.util.Scanner;

import desktop_codebehind.*;
import desktop_fields.*;
import desktop_resources.*;
import stringBanks.Fields_StringBank;
import stringBanks.Game_StringBank;

public class Game {


	private int numOfPlayers = 2;
	private int numOfDice = 2;
	private int numOfDiceSides = 6;
	private int nFields = 12;
	private int turn = 0;
	DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);
	PlayerManager pMan = new PlayerManager(numOfPlayers);



	public void play()
	{
		//Lets go
		
		Scanner keyb = new Scanner(System.in);
		int[] playerPos = new int[numOfPlayers];
		int[] fieldEffect = {0,250,-100,100,-20,180,0,-70,60,-80,-50,650};
		String input;
		boolean noWinner = true;
		int diceResult;
		makeFields();


		for(int i = 0; i<numOfPlayers;i++)
		{
			playerPos[i]=0;
		}

		initBoard();



		while(noWinner)
		{

			
			if(processInput())
			{
				break;
			}
			

			diceCup.rollDice();

			diceResult = diceCup.getDiceTotal();

			//Moves the player on the board
			playerPos[turn]=(playerPos[turn]+diceResult)%nFields; 

			pMan.get(turn).accesAccount().deposit(fieldEffect[playerPos[turn]]);
			updatePlayerStatus();
			//Shows the field msg
			Fields_StringBank.randomizer();
			GUI.showMessage(Fields_StringBank.getBoardMessage(playerPos[turn],pMan.get(turn).getGameCharacter()));

			
			

			if(pMan.get(turn).accesAccount().getBalance()>=3000)
			{
				noWinner = false;
			}
			
			//Change turn unless the player lands on werewall
			
			turn =(turn+(playerPos[turn]==9?0:1))%numOfPlayers;


		}
		GUI.close();
	}

	private void makeFields()
	{

		String[] fieldEffect = {"0","+250","-100","+100","-20","+180","0","-70","+60","-80","-50","+650"};

		Color[] bgColors = {Color.DARK_GRAY,Color.BLUE,Color.ORANGE ,Color.cyan ,Color.cyan ,Color.YELLOW ,
				Color.gray ,Color.BLACK ,Color.LIGHT_GRAY ,Color.magenta ,Color.PINK ,Color.GREEN };

		Color[] fgColors = {Color.BLUE,Color.DARK_GRAY,Color.BLACK ,Color.green ,Color.red ,Color.BLUE ,
				Color.MAGENTA ,Color.PINK ,Color.YELLOW ,Color.GRAY ,Color.white ,Color.ORANGE };
		Field[] fields = new Field[nFields];

		for (int i = 0; i<nFields;i++)
		{
			fields[i]= new Tax.Builder().setTitle(Fields_StringBank.getFieldNames(i)).
					setDescription(String.valueOf(fieldEffect[i])).
					setSubText("").setBgColor(bgColors[i]).setFgColor(fgColors[i]).build();
		}

		GUI.create(fields);

	}


	/**
	 * @return
	 * true if game is ending<br>
	 * false if game is continuing
	 * @param String input
	 */
	private boolean processInput()
	{
		String[] gameOptions = Game_StringBank.getGameOptions();
		
		while(true)
		{
			String input = GUI.getUserSelection(pMan.get(turn).getName()+"'s turn - "+Game_StringBank.getGameOptionsTitle(),gameOptions);
			if(input.equals(gameOptions[0]))
			{
				return false;
			}
			else if(input.equals(gameOptions[1]))
			{
				GUI.showMessage(Game_StringBank.getDiceChanged());
				diceCup.changeDice(numOfDiceSides);
			}
			else if(input.equals(gameOptions[2]))
			{
				return true;
			}
		}

	}




private void initBoard()
{

	//Add the players on the board
	for(int i = 0 ; i<numOfPlayers;i++)
	{
		GUI.addPlayer(pMan.get(i).getName(), pMan.get(i).accesAccount().getBalance());
	}

}


private void updatePlayerStatus()
{
	for(int i = 0 ; i<numOfPlayers;i++)
	{
		GUI.setBalance(pMan.get(i).getName(), pMan.get(i).accesAccount().getBalance());
	}
}




}
