package game;
import java.util.*;
public class DiceManager {
	//Dice Cup
	ArrayList<Dice> diceList;
	
	public DiceManager(int numOfDice, int numOfSides)
	{
		for(int i=0 ; i<numOfDice;i++)
		{
			diceList.add(new Dice(numOfSides));
		}
	}
	
	public int getDiceValue(int diceNumber)
	{
		return diceList.get(diceNumber).getFaceValue();
	}

	public void rollDice()
	{
		for(int i = 0; i<diceList.size();i++)
		{
			diceList.get(i).roll();
		}
	}
		
	public void changeDice(int numOfSides)
	{
		int size = diceList.size();
		diceList.clear();
		for(int i=0 ; i<size;i++)
		{
			diceList.add(new Dice(numOfSides));
		}
	}
	}

