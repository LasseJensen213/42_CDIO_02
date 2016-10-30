package stringBanks;

public class PlayerManager_StringBank {

	
	//Choose character
	private static String character = "Choose between the following characters: " +"\n Warrior \n Wizard \n Dwarf \n Elf \n Thief";

	//Choose name
	private static String name = "Pleace choose your name";
	
	//Name taken
	private static String nametaken = "Name has already been taken. Please enter a new one";
	
	//Invalid character choice
	private static String invalidchar = "Invalid character choice. \n\t Please enter your choice of character.";
	
	
	
	
	
	
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
}
