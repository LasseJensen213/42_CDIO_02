package stringBanks;

public class Game_StringBank 
{
	
	
	private static String gameTitle = "Non-generic board game title";
	
	private static String gameOptionsTitle = "Choose your next action";
	
	private static String diceChanged = "You have replaced the dice";
	
	private static String winnerMsg_0 = "Congratulations! ";
	
	private static String winnerMsg_1 = " has won with: ";
	
	private static String winnerMsg_2 =" coins!";
	
	private static String[] gameOptions = {"Roll", "Replace the dice", "Exit game"};
	
	private static String[] winnerMsg = {winnerMsg_0,winnerMsg_1,winnerMsg_2};
	
	
	/**
	 * 
	 * @return
	 * 0: Roll dice <br>
	 * 1: Change Dice <br>
	 * 2: Exit
	 */
	public static String[] getGameOptions()
	{
		return gameOptions;
	}

	public static String getGameTitle() {
		return gameTitle;
	}

	public static String getDiceChanged(){
		return diceChanged;
	}

	public static String getGameOptionsTitle() {
		return gameOptionsTitle;
	}
	
	public static String[] getWinnerMsg()
	{
		return winnerMsg;
	}

	
	

	
	

}