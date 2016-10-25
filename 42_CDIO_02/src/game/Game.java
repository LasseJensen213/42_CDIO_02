package game;

import java.util.Scanner;

public class Game {


	private Player[] playerArr;
	private int numOfPlayers = 2;
	private int numOfDice = 2;
	private int numOfDiceSides = 6;
	private int playerNum = 1;

	public void play()
	{
		//Lets go
		playerArr = initPlayers(numOfPlayers);
	}

	private Player[] initPlayers(int numOfPlayers)
	{
		Player[] playerArr = new Player[numOfPlayers];
		Scanner keyb = new Scanner(System.in);
		String[] nameArr = new String[numOfPlayers];
		String input;
		int charNum;
		
		
		for(int i = 0; i<numOfPlayers;i++)
		{
			charNum = chooseCharacter();
			System.out.println("BRUG FOR BESKED HER I STRINGBANK");
			while(true)
			{
				input = keyb.nextLine();
				if(input.length()==0)
				{
					input = "PLAYER_PLACEHOLDER "+playerNum;
					if(nameTaken(nameArr,input,i))
					{
						System.out.println("STRINGBANK MANGLER NAME TAKEN BESKED");
						
					}
					else
					{
						playerArr[i]=new Player(input,charNum);
						playerNum++;
					}
				}
				else
				{
					if(nameTaken(nameArr,input,i))
					{
						System.out.println("STRINGBANK MANGLER NAME TAKEN BESKED");
					}
					else
					{
						playerArr[i]=new Player(input,charNum);
						playerNum++;
					}
				}
			}
		}
		return playerArr;
	}
	
	
	
	

	private boolean nameTaken(String[] nameArr, String currentName,int namesSoFar)
	{
		for(int i = 0; i<namesSoFar;i++)
		{
			if(nameArr[i].equals(currentName))
			{
				return true;
			}
		}
		return false;
	}
	
	

	private int chooseCharacter()
	{
		Scanner keyb = new Scanner(System.in);
		String input ="";
		while(true)
		{
			System.out.println("CHOOSE_BETWEEN_THESE_STRINGBANK");
			input = keyb.nextLine();
			if(input.equals(StringBank.getCharacterName(0)))
			{
				return 0;
			}
			else if(input.equals(StringBank.getCharacterName(1)))
			{
				return 1;
			}
			else if(input.equals(StringBank.getCharacterName(2)))
			{
				return 2;
			}
			else if(input.equals(StringBank.getCharacterName(3)))
			{
				return 3;
			}
			else if(input.equals(StringBank.getCharacterName(4)))
			{
				return 4;
			}
			else
			{
				System.out.println("INVALID INPUT PLACEHOLDER");
			}
		}
	}


}
