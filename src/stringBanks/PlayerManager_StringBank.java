package stringBanks;

public class PlayerManager_StringBank {

	
	private static String genericPlayerName = "Player";
	
	//Choose character
	private static String character = "Choose between the following characters: ";

	//Choose name
	private static String name = "Please choose your name";
	
	//Name taken
	private static String nametaken = "Name has already been taken. Please enter a new one";
	
	//Invalid character choice
	private static String invalidchar = "Invalid character choice. \n\t Pleace enter your choice of character.";
	
	private static String nameTooLong = "Sorry, but the name is too long, it can max be 16 chars";
	
	
	
	
	
	
	//Getters
	public static String getCharacter() {
		return character;
	}

	public static String getName() {
		return name;
	}
	
	public static String getNameTaken() {
		return nametaken;
	
	}
	
	public static String getInvalidChar() {
		return invalidchar;
	}
	
	public static String getGenericPlayer()
	{
		return genericPlayerName;
	}
	
	public static String getNameTooLong()
	{
		return nameTooLong;
	}
}