package game;

import java.awt.Color;
import java.util.Scanner;

import desktop_codebehind.*;
import desktop_fields.*;
import desktop_resources.*;

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
		makeFields();
			

		for(int i = 0; i<numOfPlayers;i++)
		{
			playerPos[i]=0;
		}



		while(noWinner)
		{
			System.out.println(pMan.get(turn).getName()+" "
					+StringBank.getCharacterName(pMan.get(turn).getGameCharacter())
					+" "+pMan.get(turn).accesAccount().getBalance());
			String[] options = {"no", "yes"};
			GUI.getUserSelection("Hello",options );
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

			turn =(turn+(playerPos[turn]==8?0:1))%numOfPlayers;


		}
	}
	
	private void makeFields()
	{
		
		String[] fieldEffect = {"+250","-100","+100","-20","+180","0","-70","+60","-80","-50","+650"};
		
		Color[] bgColors = {Color.BLUE,Color.ORANGE ,Color.cyan ,Color.cyan ,Color.YELLOW ,
				Color.gray ,Color.BLACK ,Color.LIGHT_GRAY ,Color.magenta ,Color.PINK ,Color.GREEN };
		
		Color[] fgColors = {Color.DARK_GRAY,Color.BLACK ,Color.green ,Color.red ,Color.BLUE ,
				Color.MAGENTA ,Color.PINK ,Color.YELLOW ,Color.GRAY ,Color.white ,Color.ORANGE };
		Field[] fields = new Field[nFields];
		
		for (int i = 0; i<nFields;i++)
		{
			fields[i]= new Tax.Builder().setTitle(StringBank.getFieldNames(i)).
					setDescription(String.valueOf(fieldEffect[i])).
					setSubText("").setBgColor(bgColors[i]).setFgColor(fgColors[i]).build();
		}
		
		GUI.create(fields);
		
	}




}