package game;


import desktop_resources.GUI;

import stringBanks.PlayerManager_StringBank;
import stringBanks.Fields_StringBank;

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
				charNum = chooseCharacter();
				while(true)
				{
					input = GUI.getUserString(PlayerManager_StringBank.getGenericPlayer()+" "+playerNum+" "+PlayerManager_StringBank.getName());
					if(input.length()==0)
					{
						input = PlayerManager_StringBank.getGenericPlayer()+" "+playerNum;
						if(nameTaken(nameArr,input,i))
						{
							GUI.showMessage(PlayerManager_StringBank.getNameTaken());
							
							
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
							GUI.showMessage(PlayerManager_StringBank.getNameTaken());
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
			String input ="";
			while(true)
			{
				input = GUI.getUserSelection(PlayerManager_StringBank.getCharacter(), Fields_StringBank.getCharacterArray());
				if(input.equals(Fields_StringBank.getCharacterName(0)))
				{
					return 0;
				}
				else if(input.equals(Fields_StringBank.getCharacterName(1)))
				{
					return 1;
				}
				else if(input.equals(Fields_StringBank.getCharacterName(2)))
				{
					return 2;
				}
				else if(input.equals(Fields_StringBank.getCharacterName(3)))
				{
					return 3;
				}
				else if(input.equals(Fields_StringBank.getCharacterName(4)))
				{
					return 4;
				}
			}
		}

	}
