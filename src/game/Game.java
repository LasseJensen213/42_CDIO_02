package game;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import desktop_fields.*;
import desktop_resources.*;
import stringBanks.Fields_StringBank;
import stringBanks.Game_StringBank;

public class Game {


	private int numOfPlayers = 2;
	private int numOfDice = 2;
	private int numOfDiceSides = 6;
	private int nFields = 40;
	private int turn = 0;
	//Remembers the location of the players.
	int[] playerPos = new int[numOfPlayers];
	int gotofield[] = {4,6,8,14,16,18,24,26,28,34,36,38};
	int fieldEffect[] = {0,250,-100,100,-20,180,0,-70,60,-80,-50,650};
	DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);

	public void play() throws InterruptedException
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


				//Rolls dice and shows them on board
				diceCup.rollDice();
				showDice();
				diceResult = diceCup.getDiceTotal();

				//Moves the player on the board
				movePlayerModel(diceResult, pMan);
				playerPos[turn]=(playerPos[turn]+diceResult)%nFields; 

				//Adds or subtracts The field effect from player's balance
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


				//Updates players account balance on the board
				updatePlayerStatus(pMan);

				//Shows the field msg
				Fields_StringBank.randomizer();
				GUI.showMessage(Fields_StringBank.getBoardMessage(playerPos[turn],pMan.get(turn).getGameCharacter()));




				//Checks if current player has won
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




	//Creates the fields
	protected void makeFields()
	{
		int fieldsInUse[] = {3,5,7,13,15,17,23,25,27,33,35,37};
		Color[] bgColors = new Color[40];
		for(int i = 0;i<40;i++){
			bgColors[i] = Color.BLACK;
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					bgColors[i] = Color.BLUE;
				}		

			}

		}
		String fieldeffects[] = {"","+250","-100","+100","-20","+180","0","-70","+60","-80","-50","+650"};
		String[] fieldEffect = new String[40];
		int NrReached = 0;
		for(int i = 0;i<40;i++)
		{
			fieldEffect[i] = "";
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					fieldEffect[i] = fieldeffects[NrReached];
					NrReached++;		
				}		

			}

		}

		String[] fieldnames = new String[40];
		int nrReached = 0;
		for(int i = 0;i<40;i++){
			fieldnames[i] = "";
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					fieldnames[i]=Fields_StringBank.getFieldNames(nrReached);
					nrReached++;
				}		

			}
		}


		Color fgColors[] = new Color[40];
		for(int i = 0;i<40;i++) {
			fgColors[i] = Color.YELLOW;
		}

		Field[] fields = new Field[nFields];

		for (int i = 0; i<nFields;i++)
		{
			fields[i]= new Tax.Builder().setTitle(fieldnames[i]).setDescription(String.valueOf(fieldEffect[i])).
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

	

	private void initBoard(PlayerManager pMan)
	{
		//Start position:
		int start = 0;

		//Add the players on the board
		for(int i = 0 ; i<numOfPlayers;i++)
		{
			GUI.addPlayer(pMan.get(i).getName(), pMan.get(i).accessAccount().getBalance());
		}

		for(int i = 0; i<numOfPlayers;i++)
		{
			GUI.setCar(gotofield[start], pMan.get(i).getName());
	
		}

	}


	private void updatePlayerStatus(PlayerManager pMan)
	{
		for(int i = 0 ; i<numOfPlayers;i++)
		{
			GUI.setBalance(pMan.get(i).getName(), pMan.get(i).accessAccount().getBalance());
		}
	}

	private void movePlayerModel(int diceResult,PlayerManager pMan) throws InterruptedException
	{	
		
		updatePlayerPos(diceResult,pMan);
		int set = playerPos[turn];
		GUI.setCar(gotofield[set], pMan.get(turn).getName());
		

	}

	private void showDice()
	{
		Random rand = new Random();
		int x1 = rand.nextInt(6)+3;
		int y1 = rand.nextInt(4)+3;

		//Dice 2's position is relative to dice 1's
		int x2 = x1+rand.nextInt(7)-3;
		int y2 = y1+rand.nextInt(5)-2;

		//Makes sure that the dice doesn't land on each other
		if (x1 == x2)
		{
			x2++;
		}
		//GUI.setDice(diceCup.getDiceValue(0), diceCup.getDiceValue(1));
		GUI.setDice(diceCup.getDiceValue(0), x1, y1, diceCup.getDiceValue(1), x2, y2);
	}

	private void showWinnerMessage(int winnerNum, PlayerManager pMan)
	{
		String[] msg = Game_StringBank.getWinnerMsg();
		GUI.showMessage(msg[0]+pMan.get(winnerNum).getName()+
				msg[1]+pMan.get(winnerNum).accessAccount().getBalance()+msg[2]);
	}

	

	private void updatePlayerPos(int diceResult, PlayerManager pMan) throws InterruptedException
	{
		int wait = 500;
		for(int i = 0;i<diceResult;i++)
		{
			GUI.removeCar(gotofield[playerPos[turn]],pMan.get(turn).getName());
			playerPos[turn]++;
			
			if(playerPos[turn]==12)
			{
				playerPos[turn]=1;
			}
			GUI.setCar(gotofield[playerPos[turn]],pMan.get(turn).getName());
			TimeUnit.MILLISECONDS.sleep(wait);
		}
	}
	
	public boolean confirmInput()
	{
		return GUI.getUserLeftButtonPressed(Game_StringBank.getConfirmMsg()[0], 
				Game_StringBank.getConfirmMsg()[1], Game_StringBank.getConfirmMsg()[2]);
	}

}