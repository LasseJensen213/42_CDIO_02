package game;
public class Player extends GenericPlayer 
{
	
	private int gameCharacter;
	private Account account;
	
	public Player(String name, int gameCharacter)
	{
		super(name);
		this.gameCharacter = gameCharacter;
		account = new Account(1000);
	}
	
	public int getGameCharacter()
	{
		return this.gameCharacter;
	}
	
	public void setGameCharacter(int gameCharacter)
	{
		this.gameCharacter = gameCharacter;
	}

}
