package game;

import java.util.Scanner;

import desktop_resources.GUI;
import stringBanks.PlayerManager_StringBank;

import stringBanks.Fields_StringBank;
import stringBanks.PlayerManager_StringBank;
public class PlayerManager {
	
	private Player[] playerArr;
	private int playerNum = 1;
	
	public  Player get(int i)
	{
		return playerArr[i];
	}
	
	public PlayerManager(int numOfPlayers)
	{
		playerArr = initPlayers(numOfPlayers);
	}
	
	
	
	private Player[] initPlayers(int numOfPlayers)
	{
		playerArr = new Player[numOfPlayers];
		String[] nameArr = new String[numOfPlayers];
		
		String input;
		int charNum;
		
		
		
		for(int i = 0; i<numOfPlayers;i++)
		{
			chooseCharacter();
			
			charNum = chooseCharacter();
			String asdf = PlayerManager_StringBank.getName();
			System.out.println(asdf);
			while(true)
			{
				input = keyb.nextLine();
				if(input.length()==0)
				{
					input = "Player"+playerNum;
					if(nameTaken(nameArr,input,i))
					{
						System.out.println(PlayerManager_StringBank.getNameTaken());
						
					}
					else
					{
						playerArr[i]=new Player(input,charNum);
						nameArr[i]=input;
						playerNum++;
						break;
					}
				}
				else
				{
					if(nameTaken(nameArr,input,i))
					{
						System.out.println(PlayerManager_StringBank.getNameTaken());
					}
					else
					{
						playerArr[i]=new Player(input,charNum);
						nameArr[i]=input;
						playerNum++;
						break;
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
	
	

	private static int chooseCharacter()
	{
		while(true)
		{
			String role = GUI.getUserSelection("Vælg rolle - Needs stringbank update", Fields_StringBank.getCharacterArray());
			if (Fields_StringBank.getCharacterName(0) == role) {
				return 0;
			}
			else if (Fields_StringBank.getCharacterName(1) == role) {
				return 1;
			}
			else if (Fields_StringBank.getCharacterName(2) == role) {
				return 2;
			}
			else if (Fields_StringBank.getCharacterName(3) == role) {
				return 3;
			}
			else if (Fields_StringBank.getCharacterName(4) == role) {
				return 4;
			}
			
			
					
			
			
		}
	}

}
