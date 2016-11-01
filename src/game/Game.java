package game;

import java.awt.Color;
import java.util.Random;
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
	private int nFields = 40;
	private int turn = 0;
	//Remembers the location of the players.
	int[] playerPos = new int[numOfPlayers];
	DiceManager diceCup = new DiceManager(numOfDice,numOfDiceSides);




	public void play()
	{
		//Lets go

		//int[] fieldEffect = {0,250,-100,100,-20,180,0,-70,60,-80,-50,650};

		boolean noWinner = true;
		int diceResult, fieldEffectInt;
		int winnerNum = 0;
		makeFields();
		PlayerManager pMan = new PlayerManager(numOfPlayers);

		for(int i = 0; i<numOfPlayers;i++)
		{
			playerPos[i]=0;
		}

		initBoard(pMan);



		while(noWinner)
		{
			//Shows the button and the options
			if(processInput(pMan))
			{
				break;
			}


			diceCup.rollDice();
			showDice();
			diceResult = diceCup.getDiceTotal();

			//Moves the player on the board and updates the player position
			movePlayerModel(diceResult, pMan);
			

			fieldEffectInt = getfieldeffect(playerPos[turn]);
			if(fieldEffectInt<0)
			{

				// if players balance goes to 0 or below he loses
				if(!pMan.get(turn).accessAccount().withdraw(-fieldEffectInt) || (pMan.get(turn).accessAccount().getBalance()==0))
				{
					noWinner = false;

					//next player wins - only makes sense when there are 2 players
					winnerNum = (turn+1)%numOfPlayers;
				}

			}
			else
			{
				pMan.get(turn).accessAccount().deposit(getfieldeffect(playerPos[turn]));
			}


			updatePlayerStatus(pMan);

			//Shows the field msg
			Fields_StringBank.randomizer();
			int fieldnumber = playerPos[turn]-1;
			int gamechar = pMan.get(turn).getGameCharacter();
			GUI.showMessage(Fields_StringBank.getBoardMessage(fieldnumber,gamechar));




			if(pMan.get(turn).accessAccount().getBalance()>=3000)
			{
				noWinner = false;
				winnerNum = turn;
			}

			//Change turn unless the player lands on werewall

			turn =(turn+(playerPos[turn]==gotofield(9)?0:1))%numOfPlayers;


		}
		if(!noWinner)
		{
			showWinnerMessage(winnerNum,pMan);
		}
		GUI.close();

	}





	private void makeFields()
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
				return true;
			}
		}

	}

	public int gotofield(int i) 
	{
		int result=0; 
		switch(i)
		{
		case 0: result = 4;
		break;
		case 1:	result = 6;
		break;
		case 2: result = 8;
		break;
		case 3: result = 14;
		break;
		case 4: result = 16;
		break;
		case 5: result = 18;
		break;
		case 6: result = 24;
		break;
		case 7: result = 26;
		break;
		case 8: result = 28;
		break;
		case 9: result = 34;
		break;
		case 10: result = 36;
		break;
		case 11: result = 38;
		break;
		}
		return result;
	}
	public int getfieldeffect(int i)
	{int result=0; 
	switch(i)
	{
	case 0:	result = 0;
	break;
	case 1:	result = 250;
	break;
	case 2: result = -100;
	break;
	case 3: result = 100;
	break;
	case 4: result = -20;
	break;
	case 5: result = 180;
	break;
	case 6: result = 0;
	break;
	case 7: result = -70;
	break;
	case 8: result = 60;
	break;
	case 9: result = -80;
	break;
	case 10: result = -50;
	break;
	case 11: result = 650;
	break;
	}
	return result;

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
			GUI.setCar(gotofield(start), pMan.get(i).getName());
	
		}

	}


	private void updatePlayerStatus(PlayerManager pMan)
	{
		for(int i = 0 ; i<numOfPlayers;i++)
		{
			GUI.setBalance(pMan.get(i).getName(), pMan.get(i).accessAccount().getBalance());
		}
	}

	private void movePlayerModel(int diceResult,PlayerManager pMan)
	{	
		
		GUI.removeCar(gotofield(playerPos[turn]), pMan.get(turn).getName());
		updatePlayerPos(diceResult);
		int set = playerPos[turn];
		GUI.setCar(gotofield(set), pMan.get(turn).getName());

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

	

	private void updatePlayerPos(int diceResult)
	{
		for(int i = 0;i<diceResult;i++)
		{
			playerPos[turn]++;
			if(playerPos[turn]==12)
			{
				playerPos[turn]=1;
			}
		}
	}
	

}