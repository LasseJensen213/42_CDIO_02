package game;

public class Account {
	
	private int balance;
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public boolean withdraw(int amount)
	{
		if(balance-amount<0)
		{
			System.out.println("Cannot withdraw - Insufficient funds");
			return false;
		}
		this.balance -= amount;
		return true;
	}
	
	public boolean deposit(int amount)
	{
		this.balance += amount;
		return true;
	}
	
	/*
	 * Ikke nødvendig for dette spil, men muligt at bruge til CDIO 03
	 */
	public void transferBalanceTo(Account account, int amount)
	{
		if(!withdraw(amount)){}				
		else
		{
			account.deposit(amount);
		}
	}
	
	public String toString()
	{
		return "This account has a balance of: "+balance;
	}

}