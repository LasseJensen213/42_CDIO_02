package game;

public class GenericPlayer {
	
	private String name;
	private Account account;
	
	public GenericPlayer(String name)
	{
		this.name = name;
		account = new Account(0);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Account accesAccount()
	{
		if(account==null){
			account = new Account(0);
		}
		return this.account;
	}
	

}
