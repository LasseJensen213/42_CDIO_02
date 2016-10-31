package game;

import java.awt.Color;
import java.util.Random;

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
	boolean skipTurn = false;
	int[] playerPos = new int[numOfPlayers];
	DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);




	public void play()
	{
		//Lets go
		int[] fieldEffect = {0,250,-100,100,-20,180,0,-70,60,-80,-50,650};
		boolean noWinner = true;
		int diceResult, fieldEffectInt;
		int winnerNum = 0;
		PlayerManager pMan = new PlayerManager(numOfPlayers);

		for(int i = 0; i<numOfPlayers;i++)
		{
			playerPos[i]=0;
		}

		initBoard(pMan);



		while(noWinner)
		{
			//Checks if the player has to skip this turn 
			if(pMan.get(turn).getSkipTurn())
			{
				pMan.get(turn).setSkipTurn(false);
				turn = (turn+1)%numOfPlayers;
			}
			else
			{
				//Shows the button and the options
				if(processInput(pMan))
				{
					break;
				}


				diceCup.rollDice();
				showDice();
				diceResult = diceCup.getDiceTotal();

				//Moves the player on the board
				movePlayerModel(diceResult, pMan);
				playerPos[turn]=(playerPos[turn]+diceResult)%nFields; 

				fieldEffectInt = fieldEffect[playerPos[turn]];
				if(fieldEffectInt<0)
				{
					pMan.get(turn).accessAccount().withdraw(-fieldEffectInt);
					if(pMan.get(turn).accessAccount().getBalance()==0)
					{
						GUI.showMessage("NEED_SKIP_TURN_MESSAGE_HERE");
						pMan.get(turn).accessAccount().deposit(100);
						pMan.get(turn).setSkipTurn(true);

					}
				}
				else
				{
					pMan.get(turn).accessAccount().deposit(fieldEffect[playerPos[turn]]);
				}


				updatePlayerStatus(pMan);

				//Shows the field msg
				Fields_StringBank.randomizer();
				GUI.showMessage(Fields_StringBank.getBoardMessage(playerPos[turn],pMan.get(turn).getGameCharacter()));




				if(pMan.get(turn).accessAccount().getBalance()>=3000)
				{
					noWinner = false;
					winnerNum = turn;
				}

				//Change turn unless the player lands on werewall

				turn =(turn+(playerPos[turn]==9?0:1))%numOfPlayers;


			}

		}
		if(!noWinner)
		{
			showWinnerMessage(winnerNum,pMan);
		}
		GUI.close();

	}





	/**
	 * create an array of fields on the board<br>
	 * need to call this before any other GUI method
	 */
	public void makeFields()
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
	private boolean processInput(PlayerManager pMan)
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
				if(confirmInput())
				{
					return true;
				}
			}
		}

	}




	/**
	 * Adds the players on the board and puts the player models in the start position
	 * @param pMan
	 */
	private void initBoard(PlayerManager pMan)
	{

		//Add the players on the board
		for(int i = 0 ; i<numOfPlayers;i++)
		{
			GUI.addPlayer(pMan.get(i).getName(), pMan.get(i).accessAccount().getBalance());
		}

		for(int i = 0; i<numOfPlayers;i++)
		{
			GUI.setCar(1, pMan.get(i).getName());
		}

	}


	/**
	 * Updates the players balance on the board<br>
	 * does not change his account balance 
	 * @param pMan
	 */
	private void updatePlayerStatus(PlayerManager pMan)
	{
		for(int i = 0 ; i<numOfPlayers;i++)
		{
			GUI.setBalance(pMan.get(i).getName(), pMan.get(i).accessAccount().getBalance());
		}
	}


	/**
	 * Moves the player model, in this case his car
	 * @param diceResult
	 * @param pMan
	 */
	private void movePlayerModel(int diceResult,PlayerManager pMan)
	{	

		GUI.removeCar(playerPos[turn]+1, pMan.get(turn).getName());
		GUI.setCar((playerPos[turn]+diceResult)%nFields+1, pMan.get(turn).getName());

	}


	//Shows the dice with their face values on the board
	private void showDice()
	{
		Random rand = new Random();
		int x1 = rand.nextInt(6)+3;
		int y1 = rand.nextInt(4)+3;

		//Dice 2's position is relative to dice 1's
		int x2 = x1+rand.nextInt(7)-3;
		int y2 = y1+rand.nextInt(5)-2;

		//Makes sure that the dice doesn't land on each other
		if (x1 == x2 && y2==y1)
		{
			x2++;
		}
		//GUI.setDice(diceCup.getDiceValue(0), diceCup.getDiceValue(1));
		GUI.setDice(diceCup.getDiceValue(0), x1, y1, diceCup.getDiceValue(1), x2, y2);
	}

	/**
	 * shows name and amount of coins of the winner as GUI message
	 * @param winnerNum
	 * @param pMan
	 */
	private void showWinnerMessage(int winnerNum, PlayerManager pMan)
	{
		String[] msg = Game_StringBank.getWinnerMsg();
		GUI.showMessage(msg[0]+pMan.get(winnerNum).getName()+
				msg[1]+pMan.get(winnerNum).accessAccount().getBalance()+msg[2]);
	}

	public boolean confirmInput()
	{
		return GUI.getUserLeftButtonPressed(Game_StringBank.getConfirmMsg()[0], 
				Game_StringBank.getConfirmMsg()[1], Game_StringBank.getConfirmMsg()[2]);
	}




}
