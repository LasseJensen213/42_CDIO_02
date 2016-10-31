package game;
public class Player extends GenericPlayer 
{
	
	private int gameCharacter;
	
	public Player(String name, int gameCharacter)
	{
		super(name);
		this.gameCharacter = gameCharacter;
		super.accessAccount().deposit(1000);
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
