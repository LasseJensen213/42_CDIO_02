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



	public void withdraw(int amount)
	{
		this.balance -= amount;
	}
	
	public void deposit(int amount)
	{
		this.balance += amount;
	}
	
	/*
	 * Ikke nødvendig for dette spil, men muligt at bruge til CDIO 03
	 */
	public void transferBalanceTo(Account account, int amount)
	{
		if((this.balance-amount)<0)
		{
			System.out.println("Insufficient funds.");
		}
		else
		{
			this.withdraw(amount);
			account.deposit(amount);
		}
	}

}
